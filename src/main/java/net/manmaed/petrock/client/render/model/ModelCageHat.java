package net.manmaed.petrock.client.render.model;

import net.minecraft.client.model.Cuboid;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.entity.Entity;

/**
 * Created by manmaed on 29/11/2019.
 */
public class ModelCageHat<T extends Entity> extends EntityModel<T> {

    private Cuboid FB1;
    private Cuboid FB2;
    private Cuboid FB3;
    private Cuboid FB4;
    private Cuboid RB1;
    private Cuboid RB2;
    private Cuboid RB3;
    private Cuboid RB4;
    private Cuboid RiB2;
    private Cuboid RiB3;
    private Cuboid LeB3;
    private Cuboid TB1;
    private Cuboid TB2;
    private Cuboid nib1;
    private Cuboid nib2;
    private Cuboid nib3;
    private Cuboid nib4;
    private Cuboid nib5;
    private Cuboid nib6;
    private Cuboid nib7;
    private Cuboid nib8;
    private Cuboid nib9;
    private Cuboid nib10;
    private Cuboid nib11;
    private Cuboid nib12;
    private Cuboid snib6;
    private Cuboid snib1;
    private Cuboid LeB2;
    private Cuboid snib3;
    private Cuboid snib4;
    private Cuboid snib5;
    private Cuboid snib2;

    public ModelCageHat() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.nib6 = new Cuboid(this, 0, 17);
        this.nib6.setRotationPoint(0.0F, 23.0F, -3.0F);
        this.nib6.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 2, 0.0F);
        this.LeB2 = new Cuboid(this, 0, 0);
        this.LeB2.setRotationPoint(-6.0F, 33.1F, -2.0F);
        this.LeB2.addBox(-1.0F, -11.0F, -1.0F, 2, 11, 2, 0.0F);
        this.nib1 = new Cuboid(this, 0, 17);
        this.nib1.setRotationPoint(-4.0F, 23.0F, -7.0F);
        this.nib1.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 2, 0.0F);
        this.FB4 = new Cuboid(this, 0, 0);
        this.FB4.setRotationPoint(6.0F, 33.0F, -6.0F);
        this.FB4.addBox(-1.0F, -11.0F, -1.0F, 2, 11, 2, 0.0F);
        this.LeB3 = new Cuboid(this, 0, 0);
        this.LeB3.setRotationPoint(-6.0F, 33.1F, 2.0F);
        this.LeB3.addBox(-1.0F, -11.0F, -1.0F, 2, 11, 2, 0.0F);
        this.nib7 = new Cuboid(this, 0, 17);
        this.nib7.setRotationPoint(0.0F, 23.0F, 1.0F);
        this.nib7.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 2, 0.0F);
        this.RB4 = new Cuboid(this, 0, 0);
        this.RB4.setRotationPoint(6.0F, 33.0F, 6.0F);
        this.RB4.addBox(-1.0F, -11.0F, -1.0F, 2, 11, 2, 0.0F);
        this.snib6 = new Cuboid(this, 0, 17);
        this.snib6.setRotationPoint(6.0F, 23.0F, 3.0F);
        this.snib6.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 2, 0.0F);
        this.RiB2 = new Cuboid(this, 0, 0);
        this.RiB2.setRotationPoint(6.0F, 33.0F, -2.0F);
        this.RiB2.addBox(-1.0F, -11.0F, -1.0F, 2, 11, 2, 0.0F);
        this.snib1 = new Cuboid(this, 0, 17);
        this.snib1.setRotationPoint(-6.0F, 23.0F, -5.0F);
        this.snib1.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 2, 0.0F);
        this.snib2 = new Cuboid(this, 0, 17);
        this.snib2.setRotationPoint(-6.0F, 23.0F, -1.0F);
        this.snib2.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 2, 0.0F);
        this.nib10 = new Cuboid(this, 0, 17);
        this.nib10.setRotationPoint(4.0F, 23.0F, -3.0F);
        this.nib10.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 2, 0.0F);
        this.RB3 = new Cuboid(this, 0, 0);
        this.RB3.setRotationPoint(2.0F, 33.0F, 6.0F);
        this.RB3.addBox(-1.0F, -11.0F, -1.0F, 2, 11, 2, 0.0F);
        this.nib9 = new Cuboid(this, 0, 17);
        this.nib9.setRotationPoint(4.0F, 23.0F, -7.0F);
        this.nib9.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 2, 0.0F);
        this.RiB3 = new Cuboid(this, 0, 0);
        this.RiB3.setRotationPoint(6.0F, 33.0F, 2.0F);
        this.RiB3.addBox(-1.0F, -11.0F, -1.0F, 2, 11, 2, 0.0F);
        this.nib2 = new Cuboid(this, 0, 17);
        this.nib2.setRotationPoint(-4.0F, 23.0F, -3.0F);
        this.nib2.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 2, 0.0F);
        this.snib3 = new Cuboid(this, 0, 17);
        this.snib3.setRotationPoint(-6.0F, 23.0F, 3.0F);
        this.snib3.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 2, 0.0F);
        this.FB3 = new Cuboid(this, 0, 0);
        this.FB3.setRotationPoint(2.0F, 33.0F, -6.0F);
        this.FB3.addBox(-1.0F, -11.0F, -1.0F, 2, 11, 2, 0.0F);
        this.nib12 = new Cuboid(this, 0, 17);
        this.nib12.setRotationPoint(4.0F, 23.0F, 5.0F);
        this.nib12.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 2, 0.0F);
        this.snib4 = new Cuboid(this, 0, 17);
        this.snib4.setRotationPoint(6.0F, 23.0F, -5.0F);
        this.snib4.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 2, 0.0F);
        this.TB1 = new Cuboid(this, 0, 4);
        this.TB1.setRotationPoint(-2.0F, 23.0F, 0.0F);
        this.TB1.addBox(-1.0F, -1.0F, -5.0F, 2, 2, 10, 0.0F);
        this.nib11 = new Cuboid(this, 0, 17);
        this.nib11.setRotationPoint(4.0F, 23.0F, 1.0F);
        this.nib11.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 2, 0.0F);
        this.FB1 = new Cuboid(this, 0, 0);
        this.FB1.setRotationPoint(-6.0F, 33.0F, -6.0F);
        this.FB1.addBox(-1.0F, -11.0F, -1.0F, 2, 11, 2, 0.0F);
        this.RB2 = new Cuboid(this, 0, 0);
        this.RB2.setRotationPoint(-2.0F, 33.0F, 6.0F);
        this.RB2.addBox(-1.0F, -11.0F, -1.0F, 2, 11, 2, 0.0F);
        this.nib5 = new Cuboid(this, 0, 17);
        this.nib5.setRotationPoint(0.0F, 23.0F, -7.0F);
        this.nib5.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 2, 0.0F);
        this.snib5 = new Cuboid(this, 0, 17);
        this.snib5.setRotationPoint(6.0F, 23.0F, -1.0F);
        this.snib5.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 2, 0.0F);
        this.nib3 = new Cuboid(this, 0, 17);
        this.nib3.setRotationPoint(-4.0F, 23.0F, 1.0F);
        this.nib3.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 2, 0.0F);
        this.RB1 = new Cuboid(this, 0, 0);
        this.RB1.setRotationPoint(-6.0F, 33.0F, 6.0F);
        this.RB1.addBox(-1.0F, -11.0F, -1.0F, 2, 11, 2, 0.0F);
        this.FB2 = new Cuboid(this, 0, 0);
        this.FB2.setRotationPoint(-2.0F, 33.0F, -6.0F);
        this.FB2.addBox(-1.0F, -11.0F, -1.0F, 2, 11, 2, 0.0F);
        this.TB2 = new Cuboid(this, 0, 4);
        this.TB2.setRotationPoint(2.0F, 23.0F, 0.0F);
        this.TB2.addBox(-1.0F, -1.0F, -5.0F, 2, 2, 10, 0.0F);
        this.nib4 = new Cuboid(this, 0, 17);
        this.nib4.setRotationPoint(-4.0F, 23.0F, 5.0F);
        this.nib4.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 2, 0.0F);
        this.nib8 = new Cuboid(this, 0, 17);
        this.nib8.setRotationPoint(0.0F, 23.0F, 5.0F);
        this.nib8.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 2, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.nib6.render(f5);
        this.LeB2.render(f5);
        this.nib1.render(f5);
        this.FB4.render(f5);
        this.LeB3.render(f5);
        this.nib7.render(f5);
        this.RB4.render(f5);
        this.snib6.render(f5);
        this.RiB2.render(f5);
        this.snib1.render(f5);
        this.snib2.render(f5);
        this.nib10.render(f5);

        this.RB3.render(f5);
        this.nib9.render(f5);
        this.RiB3.render(f5);
        this.nib2.render(f5);
        this.snib3.render(f5);
        this.FB3.render(f5);
        this.nib12.render(f5);
        this.snib4.render(f5);
        this.TB1.render(f5);
        this.nib11.render(f5);
        this.FB1.render(f5);
        this.RB2.render(f5);
        this.nib5.render(f5);
        this.snib5.render(f5);
        this.nib3.render(f5);
        this.RB1.render(f5);
        this.FB2.render(f5);
        this.TB2.render(f5);
        this.nib4.render(f5);
        this.nib8.render(f5);
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
