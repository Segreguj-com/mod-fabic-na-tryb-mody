
package net.mcreator.modynasegreguj.block;

import net.minecraft.loot.context.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.block.Material;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.modynasegreguj.ModyNaSegregujMod;

import net.fabricmc.fabric.api.tools.FabricToolTags;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;

import java.util.List;
import java.util.Collections;

public class SegregujOreBlock extends Block {
	public SegregujOreBlock() {
		super(FabricBlockSettings.of(Material.STONE).strength(3F, 5F).lightLevel(0).breakByTool(FabricToolTags.PICKAXES, 2));
	}

	@Override
	public List<ItemStack> getDroppedStacks(BlockState state, LootContext.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDroppedStacks(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(ModyNaSegregujMod.SegregujGem_ITEM));
	}
}
