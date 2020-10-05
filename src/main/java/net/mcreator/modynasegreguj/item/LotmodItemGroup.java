
package net.mcreator.modynasegreguj.item;

import net.minecraft.util.Identifier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.block.Blocks;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;

public final class LotmodItemGroup {
	public static ItemGroup get() {
		return ITEM_GROUP;
	}
	private static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.create(new Identifier("mody_na_segreguj", "lotmod")).icon(() -> {
		return new ItemStack(Blocks.ENDER_CHEST);
	}).build();
}
