package net.manmaed.petrock.block;

import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tools.FabricToolTags;
import net.manmaed.petrock.PetRock;
import net.manmaed.petrock.item.PRBlockItem;
import net.manmaed.petrock.libs.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

/**
 * Created by manmaed on 30/08/2019.
 */
public class PRBlocks {

    /* Example On Registering Blocks
    public static Block blockname;

    * in RegisterItems()
    blockname = new Block(FabricBlockSettings.of(Material.X).blarbar().build());
    makeBlocks("nameofblock", blockname);
     */

    public static Block stoneiumore;
    public static Block stoneiumblock;

    public static void RegisterBlocks() {

        stoneiumore = new Block(FabricBlockSettings.of(Material.STONE).hardness(3.0F).breakByTool(FabricToolTags.PICKAXES, 2).build());
        stoneiumblock = new Block(FabricBlockSettings.of(Material.STONE).hardness(3.0F).breakByTool(FabricToolTags.PICKAXES, 2).build());

        makeBlocks("stoneiumore", stoneiumore);
        makeBlocksWithTooltip("stoneiumblock", stoneiumblock);
    }

    public static void makeBlocksWithTooltip(String blockName, Block block) {
        Registry.register(Registry.BLOCK, new Identifier(Reference.MOD_ID, blockName), block);
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, blockName), new PRBlockItem(block, new Item.Settings().group(PetRock.ITEM_GROUP), blockName));
    }

    public static void makeBlocks(String blockName, Block block) {
        Registry.register(Registry.BLOCK, new Identifier(Reference.MOD_ID, blockName), block);
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, blockName), new BlockItem(block, new Item.Settings().group(PetRock.ITEM_GROUP)));
        }
}

