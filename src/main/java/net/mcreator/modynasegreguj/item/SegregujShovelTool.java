
package net.mcreator.modynasegreguj.item;

import net.minecraft.recipe.Ingredient;
import net.minecraft.item.ToolMaterial;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;

public class SegregujShovelTool {
	public static final ToolMaterial SEGREGUJSHOVEL_TOOL_MATERIAL = new ToolMaterial() {
		@Override
		public int getDurability() {
			return 250;
		}

		@Override
		public float getMiningSpeedMultiplier() {
			return 6F;
		}

		@Override
		public float getAttackDamage() {
			return 0F;
		}

		@Override
		public int getMiningLevel() {
			return 2;
		}

		@Override
		public int getEnchantability() {
			return 14;
		}

		@Override
		public Ingredient getRepairIngredient() {
			return Ingredient.EMPTY;
		}
	};
	public static final Item INSTANCE = new ShovelItem(SEGREGUJSHOVEL_TOOL_MATERIAL, -3, -3, (new Item.Settings().group(ItemGroup.TOOLS))) {
	};
}
