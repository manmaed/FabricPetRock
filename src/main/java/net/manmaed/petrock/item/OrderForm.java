package net.manmaed.petrock.item;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

/**
 * Created by manmaed on 30/08/2019.
 */
public class OrderForm extends Item {

    public OrderForm(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand) {
        if(!world.isClient) {
            ItemStack itemStack = player.getStackInHand(hand);
            if(!player.abilities.creativeMode) {
                itemStack.decrement(1);
            }
            //player.inventory.insertStack(new ItemStack(PRItems.petrockbox));
            player.inventory.insertStack(new ItemStack(PRItems.petrockbox.asItem()));
        }
        return super.use(world, player, hand);
    }
}
