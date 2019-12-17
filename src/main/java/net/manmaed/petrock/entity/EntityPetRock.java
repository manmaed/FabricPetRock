package net.manmaed.petrock.entity;

import net.manmaed.petrock.item.PRItems;
import net.minecraft.block.BlockState;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.entity.passive.TameableEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.UUID;

/**
 * Created by manmaed on 30/08/2019.
 */
public class EntityPetRock extends TameableEntity {

    public EntityPetRock(EntityType<? extends TameableEntity> entityType, World world) {
        super(entityType, world);
        this.setTamed(false);
    }

    protected void initGoals()
    {
        this.sitGoal = new SitGoal(this);
        this.goalSelector.add(0, new SwimGoal(this));
        this.goalSelector.add(1, this.sitGoal);
        this.goalSelector.add(2, new FollowOwnerGoal(this, 1D, 4F, 2F));
        this.goalSelector.add(3, new LookAtEntityGoal(this, PlayerEntity.class, 8F));
        this.goalSelector.add(4, new WanderAroundFarGoal(this, 1D));

        this.targetSelector.add(1, new TrackOwnerAttackerGoal(this));
        this.targetSelector.add(2, new AttackWithOwnerGoal(this));
        this.targetSelector.add(3, (new RevengeGoal(this, new Class[0])).setGroupRevenge(new Class[0]));
    }

    protected void initAttributes()
    {
        super.initAttributes();
        this.getAttributeInstance(EntityAttributes.MOVEMENT_SPEED).setBaseValue(0.25D);
        if (this.isTamed())
        {
            this.getAttributeInstance(EntityAttributes.MAX_HEALTH).setBaseValue(20.0D);
        } else {
            this.getAttributeInstance(EntityAttributes.MAX_HEALTH).setBaseValue(2.0D);
        }
    }



    protected void playStepSound(BlockPos pos, BlockState blockIn)
    {
        this.playSound(SoundEvents.BLOCK_STONE_STEP, 0.15F, 1.0F);
    }

    protected SoundEvent getHurtSound(DamageSource damageSourceIn)
    {
        return SoundEvents.BLOCK_STONE_BREAK;
    }

    protected SoundEvent getDeathSound()
    {
        return SoundEvents.BLOCK_STONE_BREAK;
    }

    /**
     * Returns the volume for the sounds this mob makes.
     */
    protected float getSoundVolume()
    {
        return 0.4F;
    }

    public void setTamed(boolean tamed)
    {
        super.setTamed(tamed);

        if (tamed)
        {
            this.getAttributeInstance(EntityAttributes.MAX_HEALTH).setBaseValue(20.0D);
        } else {
            this.getAttributeInstance(EntityAttributes.MAX_HEALTH).setBaseValue(1.0D);
        }

    }

    public boolean interactMob(PlayerEntity player, Hand hand)
    {
        ItemStack stack = player.getStackInHand(hand);
        if(stack.getItem().equals(Items.NAME_TAG)) {
            this.setCustomName(stack.getName());
        }
        if (this.isTamed())
        {
            if (this.isOwner(player) && !this.world.isClient && !stack.getItem().equals(PRItems.stoneium) && !stack.getItem().equals(PRItems.kibble))
            {
                this.sitGoal.setEnabledWithOwner(!this.isSitting());
                this.jumping = false;
                this.navigation.stop();
            }
            if(stack.getItem() == PRItems.kibble && getHealth() < 20.0F) {
                if (!player.abilities.creativeMode) {
                    stack.decrement(1);
                }
                this.heal(3.0F);
                return true;
            }
        }
        else if (!this.isTamed()) {
            if (stack.getItem() == PRItems.stoneium ){
                if (!player.abilities.creativeMode) {
                    stack.decrement(1);
                }

                if (!this.world.isClient) {
                    if (this.random.nextInt(3) == 0) {
                        this.setOwner(player);
                        this.navigation.stop();
                        this.sitGoal.setEnabledWithOwner(true);
                        this.setHealth(20.0F);
                        this.showEmoteParticle(true);
                        this.world.sendEntityStatus(this, (byte) 7);
                    } else {
                        this.showEmoteParticle(false);
                        this.world.sendEntityStatus(this, (byte) 6);
                    }
                }

            }
            return true;
        }
        return super.interactMob(player, hand);
    }

    //TODO: Entitiy Breading
    @Override
    public PassiveEntity createChild(PassiveEntity ageable) {
        EntityPetRock petRock = new EntityPetRock((PREntitys.petrock), this.world);
        UUID uuid = this.getOwnerUuid();
        if(uuid != null) {
            petRock.setOwnerUuid(uuid);
            petRock.setTamed(true);

        }
        return petRock;
    }

    public boolean canMateWith(AnimalEntity otherAnimal)
    {
        if (otherAnimal == this)
        {
            return false;
        }
        else if (!this.isTamed())
        {
            return false;
        }
        else if (!(otherAnimal instanceof EntityPetRock))
        {
            return false;
        }
        else
        {
            EntityPetRock petRock = (EntityPetRock)otherAnimal;

            if (!petRock.isTamed())
            {
                return false;
            }
            else if (petRock.isSitting())
            {
                return false;
            }
            else
            {
                return this.isInLove() && petRock.isInLove();
            }
        }
    }
}