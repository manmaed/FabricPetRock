package net.manmaed.petrock.item;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.Block;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.world.World;

import java.util.List;

/**
 * Created by manmaed on 30/08/2019.
 */
public class PRBlockItem extends BlockItem {

    public static String tt;
    private final Block block;

    public PRBlockItem(Block block, Settings settings, String blockname) {
        super(block, settings);
        this.block = block;
        this.tt = "block.petrock." + blockname + ".tooltip";
    }

    private static String gettooltip() {
        return tt;
    }

    @Override
    @Environment(EnvType.CLIENT)
    public void appendTooltip(ItemStack itemStack, World world, List<Text> list, TooltipContext tooltipContext) {
        list.add(new TranslatableText(gettooltip()));
    }
}
