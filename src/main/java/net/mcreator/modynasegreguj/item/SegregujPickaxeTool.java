
package net.mcreator.modynasegreguj.item;

import net.minecraft.recipe.Ingredient;
import net.minecraft.item.ToolMaterial;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;

public class SegregujPickaxeTool {
	public static final ToolMaterial SEGREGUJPICKAXE_TOOL_MATERIAL = new ToolMaterial() {
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
	public static final Item INSTANCE = new PickaxeItem(SEGREGUJPICKAXE_TOOL_MATERIAL, -3, -3, (new Item.Settings().group(ItemGroup.TOOLS))) {
	};
}
