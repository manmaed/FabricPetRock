package net.manmaed.petrock.entity;

import net.fabricmc.fabric.api.entity.FabricEntityTypeBuilder;
import net.manmaed.petrock.libs.Reference;
import net.minecraft.entity.EntityCategory;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

/**
 * Created by manmaed on 30/08/2019.
 */
public class PREntitys {

    public static final EntityType<EntityPetRock> petrock = FabricEntityTypeBuilder.create(EntityCategory.MISC, EntityPetRock::new).size(0.5F, 0.5F).build();

    public static void RegisterEntitys() {
        Registry.register(Registry.ENTITY_TYPE, new Identifier(Reference.MOD_ID, "petrock"), petrock);
        makeSpawnEgg("petrock", petrock, 0xdcd5d5, 0x686565);
    }

    public static void makeSpawnEgg(String entityName, EntityType type, int eggPrimary, int eggSecondary){
        //Registry.register(Registry.ENTITY_TYPE, new Identifier(Reference.MOD_ID, entityName), type);
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, entityName + "_spawn_egg"), new SpawnEggItem(type, eggPrimary, eggSecondary, new Item.Settings().group(ItemGroup.MISC)));
    }
}
