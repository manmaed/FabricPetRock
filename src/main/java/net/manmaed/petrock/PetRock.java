package net.manmaed.petrock;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.event.registry.RegistryEntryAddedCallback;
import net.manmaed.petrock.block.PRBlocks;
import net.manmaed.petrock.entity.PREntitys;
import net.manmaed.petrock.item.PRItems;
import net.manmaed.petrock.libs.PRHats;
import net.manmaed.petrock.libs.Reference;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;

/**
 * Created by manmaed on 30/08/2019.
 */
public class PetRock implements ModInitializer {

    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.create(new Identifier(Reference.MOD_ID, "itemgroup")).icon(() -> new ItemStack(PRItems.petrockbox)).build();

    @Override
    public void onInitialize() {
        PRItems.RegisterItems();
        PRBlocks.RegisterBlocks();
        PREntitys.RegisterEntitys();
        /*PREntitys.clientEntitystuff();*/
        PRHats.load();
        Registry.BIOME.forEach(this::handleBiome);
        //Listen for other biomes being registered
        RegistryEntryAddedCallback.event(Registry.BIOME).register((i, identifier, biome) -> handleBiome(biome));
    }

    private void handleBiome(Biome biome) {
        if(biome.getCategory() != Biome.Category.NETHER && biome.getCategory() != Biome.Category.THEEND) {
            biome.addFeature(
                    GenerationStep.Feature.UNDERGROUND_ORES,
                    Biome.configureFeature(
                            Feature.ORE,
                            new OreFeatureConfig(
                                    OreFeatureConfig.Target.NATURAL_STONE,
                                    PRBlocks.stoneiumore.getDefaultState(),
                                    10 //Ore vein size
                            ),
                            Decorator.COUNT_RANGE,
                            new RangeDecoratorConfig(
                                    10, //Number of veins per chunk
                                    0, //Bottom Offset
                                    10, //Min y level
                                    255 //Max y level
                            )));
        }
    }
}
