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
   /* public Cuboid HatBottem;
    public Cuboid hatp1;
    public Cuboid hatp2;
    public Cuboid hatp3;
    public Cuboid hatp4;
    public Cuboid hatp5;
    public Cuboid ballball;
    public Cuboid cake;
    public Cuboid foot1F;
    public Cuboid foot2F;
    public Cuboid CreepsBody;
    public Cuboid foot1B;
    public Cuboid foot2B;
    public Cuboid CreepsHead;
*/
    public ModelPetRock() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.shape1 = new Cuboid(this, 0, 0);
        this.shape1.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.shape1.addBox(-4.5F, -9.0F, -4.5F, 9, 9, 9, 0.0F);

        /*//christmas Hat
        this.hatp2 = new Cuboid(this, 0, 27);
        this.hatp2.setRotationPoint(0.0F, 12.0F, 0.0F);
        this.hatp2.addBox(-2.0F, 0.0F, -2.0F, 4, 1, 4, 0.0F);
        this.hatp3 = new Cuboid(this, 0, 28);
        this.hatp3.setRotationPoint(0.0F, 11.0F, 0.0F);
        this.hatp3.addBox(-1.5F, 0.0F, -1.5F, 3, 1, 3, 0.0F);
        this.hatp4 = new Cuboid(this, 0, 29);
        this.hatp4.setRotationPoint(0.0F, 10.0F, 0.0F);
        this.hatp4.addBox(-1.0F, 0.0F, -1.0F, 2, 1, 2, 0.0F);
        this.hatp1 = new Cuboid(this, 0, 26);
        this.hatp1.setRotationPoint(0.0F, 13.0F, 0.0F);
        this.hatp1.addBox(-2.5F, 0.0F, -2.5F, 5, 1, 5, 0.0F);
        this.hatp5 = new Cuboid(this, 0, 29);
        this.hatp5.setRotationPoint(0.0F, 10.5F, 0.0F);
        this.hatp5.addBox(-1.0F, 0.0F, -0.1F, 2, 2, 1, 0.0F);
        this.setRotateAngle(hatp5, 1.1838568316277536F, 0.0F, 0.0F);
        this.HatBottem = new Cuboid(this, 0, 19);
        this.HatBottem.setRotationPoint(0.0F, 14.0F, 0.0F);
        this.HatBottem.addBox(-3.0F, 0.0F, -3.0F, 6, 1, 6, 0.0F);
        this.ballball = new Cuboid(this, 19, 19);
        this.ballball.setRotationPoint(0.0F, 12.2F, 2.6F);
        this.ballball.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(ballball, 1.1838568316277536F, 0.0F, 0.0F);

        //Birthday Cake
        this.cake = new Cuboid(this, 21, 21);
        this.cake.setRotationPoint(0.0F, 15.0F, 0.0F);
        this.cake.addBox(-4.0F, -3.0F, -4.0F, 8, 3, 8, 0.0F);

        //Creeper
        this.foot2B = new Cuboid(this, 38, 0);
        this.foot2B.setRotationPoint(1.5F, 15.0F, 1.5F);
        this.foot2B.addBox(-1.0F, -2.0F, -1.0F, 2, 2, 2, 0.0F);
        this.foot1F = new Cuboid(this, 38, 0);
        this.foot1F.setRotationPoint(-1.5F, 15.0F, -1.0F);
        this.foot1F.addBox(-1.0F, -2.0F, -1.0F, 2, 2, 2, 0.0F);
        this.foot2F = new Cuboid(this, 38, 0);
        this.foot2F.setRotationPoint(1.5F, 15.0F, -1.0F);
        this.foot2F.addBox(-1.0F, -2.0F, -1.0F, 2, 2, 2, 0.0F);
        this.CreepsHead = new Cuboid(this, 38, 7);
        this.CreepsHead.setRotationPoint(0.0F, 9.0F, 0.0F);
        this.CreepsHead.addBox(-3.0F, -6.0F, -3.0F, 6, 6, 6, 0.0F);
        this.CreepsBody = new Cuboid(this, 47, 0);
        this.CreepsBody.setRotationPoint(0.0F, 13.0F, 0.0F);
        this.CreepsBody.addBox(-1.5F, -4.0F, -1.0F, 3, 4, 2, 0.0F);
        this.foot1B = new Cuboid(this, 38, 0);
        this.foot1B.setRotationPoint(-1.5F, 15.0F, 1.5F);
        this.foot1B.addBox(-1.0F, -2.0F, -1.0F, 2, 2, 2, 0.0F);*/

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