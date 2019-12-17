package net.manmaed.petrock.client.render.model;

/**
 * Created by manmaed on 26/02/2017.
 */

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.model.Cuboid;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.entity.Entity;

/**
 * PetRock - manmaed
 * Created using Tabula 5.1.0
 */

@Environment(EnvType.CLIENT)
public class ModelPetRock<T extends Entity> extends EntityModel<T> {
    public Cuboid shape1;

    public ModelPetRock() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.shape1 = new Cuboid(this, 0, 0);
        this.shape1.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.shape1.addBox(-4.5F, -9.0F, -4.5F, 9, 9, 9, 0.0F);

    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.shape1.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(Cuboid model, float x, float y, float z) {
        model.pitch = x;
        model.yaw = y;
        model.roll = z;
    }
}