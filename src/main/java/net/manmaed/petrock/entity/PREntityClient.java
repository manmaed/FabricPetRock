package net.manmaed.petrock.entity;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.render.EntityRendererRegistry;
import net.manmaed.petrock.client.render.entity.EntityRendererPetRock;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.entity.Entity;

/**
 * Created by manmaed on 05/09/2019.
 */
public class PREntityClient {

    @Environment(EnvType.CLIENT)
    public static void loadRenders() {
        EntityRendererRegistry.INSTANCE.register(EntityPetRock.class, new EntityRendererRegistry.Factory() {
            @Environment(EnvType.CLIENT)
            @Override
            public EntityRenderer<? extends Entity> create(EntityRenderDispatcher r, EntityRendererRegistry.Context it) {
                return new EntityRendererPetRock(r);
            }
        });
    }
}
