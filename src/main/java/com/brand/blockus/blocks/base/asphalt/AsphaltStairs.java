package com.brand.blockus.blocks.base.asphalt;


import net.minecraft.block.BlockState;
import net.minecraft.block.StairsBlock;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.List;

public class AsphaltStairs extends StairsBlock {

    public AsphaltStairs(BlockState baseBlockState, Settings settings) {
        super(baseBlockState, settings);
    }

    @Override
    public void onSteppedOn(World world, BlockPos pos, BlockState state, Entity entity) {
        AsphaltBlock.applySprintEffect(entity);
    }

    @Override
    public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType options) {
        AsphaltBlock.addTooltipInfo(tooltip);
    }
}
