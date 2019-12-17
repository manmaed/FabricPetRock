package net.manmaed.petrock.client.render.entity;

import net.manmaed.petrock.client.render.layers.BirthdayFeatureRenderer;
import net.manmaed.petrock.client.render.layers.ChristmasFeatureRenderer;
import net.manmaed.petrock.client.render.layers.HalloweenFeatureRenderer;
import net.manmaed.petrock.client.render.layers.SlowpokeFeatureRenderer;
import net.manmaed.petrock.client.render.model.ModelPetRock;
import net.manmaed.petrock.entity.EntityPetRock;
import net.manmaed.petrock.libs.Reference;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

/**
 * Created by manmaed on 30/08/2019.
 */
public class EntityRendererPetRock extends MobEntityRenderer<EntityPetRock, ModelPetRock<EntityPetRock>> {
    public EntityRendererPetRock(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new ModelPetRock<>(), 0.25F);
        this.addFeature(new BirthdayFeatureRenderer(this));
        this.addFeature(new ChristmasFeatureRenderer(this));
        this.addFeature(new HalloweenFeatureRenderer(this));
        this.addFeature(new SlowpokeFeatureRenderer(this));
        /*this.addFeature(toString());*/
    }

    private static final Identifier skinuntame = new Identifier(Reference.MOD_ID, "textures/entity/petrock.png");
    private static final Identifier skintame = new Identifier(Reference.MOD_ID, "textures/entity/petrock_tame.png");
    private static final Identifier skintamesit = new Identifier(Reference.MOD_ID, "textures/entity/petrocktamesit.png");
    @Override
    protected Identifier getTexture(EntityPetRock entityPetRock) {
        if(entityPetRock.isSitting()) {
            return skintamesit;
        }
        if(entityPetRock.isTamed()) {
            return skintame;
        }
        else {
            return skinuntame;
        }
    }
}
