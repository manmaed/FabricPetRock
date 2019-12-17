package net.manmaed.petrock.client.render.layers;

import com.mojang.blaze3d.platform.GlStateManager;
import net.manmaed.petrock.client.render.model.ModelChristmasHat;
import net.manmaed.petrock.client.render.model.ModelPetRock;
import net.manmaed.petrock.entity.EntityPetRock;
import net.manmaed.petrock.libs.PRHats;
import net.manmaed.petrock.libs.Reference;
import net.minecraft.client.render.entity.feature.FeatureRenderer;
import net.minecraft.client.render.entity.feature.FeatureRendererContext;
import net.minecraft.util.Identifier;

/**
 * Created by manmaed on 31/08/2019.
 */
public class ChristmasFeatureRenderer extends FeatureRenderer<EntityPetRock, ModelPetRock<EntityPetRock>> {

    private final ModelChristmasHat hat = new ModelChristmasHat();
    private static final Identifier skin = new Identifier(Reference.MOD_ID, "textures/entity/event/xmas.png");

    public ChristmasFeatureRenderer(FeatureRendererContext<EntityPetRock, ModelPetRock<EntityPetRock>> featureRendererContext) {
        super(featureRendererContext);
    }

    @Override
    public void render(EntityPetRock entityPetRock, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
        if (PRHats.christmas) {
            GlStateManager.pushMatrix();
            bindTexture(skin);
            if(PRHats.slowpoke){
                Float size = 1.5F;
                GlStateManager.translatef(0F, -2.195F, 0.05F);
                GlStateManager.scalef(size, size, size);
            } else {
                GlStateManager.translatef(0F, -0.5626F, 0F);
            }
            float pitch = interpolateValues(entityPetRock.prevPitch, entityPetRock.pitch, partialTicks);
            hat.render(entityPetRock, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
            //GlStateManager.rotate(pitch, 1.0F, 0.0F, 0.0F);
            GlStateManager.popMatrix();
        }
    }

    private float interpolateValues(float prevVal, float nextVal, float partialTick) {
        return prevVal + partialTick * (nextVal - prevVal);
    }

    @Override
    public boolean hasHurtOverlay() {
        return false;
    }
}
