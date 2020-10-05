/*
 *    MCreator note:
 *
 *    If you lock base mod element files, you can edit this file and the proxy files
 *    and they won't get overwritten. If you change your mod package or modid, you
 *    need to apply these changes to this file MANUALLY.
 *
 *
 *    If you do not lock base mod element files in Workspace settings, this file
 *    will be REGENERATED on each build.
 *
 */
package net.mcreator.modynasegreguj;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.minecraft.util.registry.Registry;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.Identifier;
import net.minecraft.util.ActionResult;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ArmorItem;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.block.Block;

import net.mcreator.modynasegreguj.item.SegregujSwordTool;
import net.mcreator.modynasegreguj.item.SegregujShovelTool;
import net.mcreator.modynasegreguj.item.SegregujPickaxeTool;
import net.mcreator.modynasegreguj.item.SegregujHoeTool;
import net.mcreator.modynasegreguj.item.SegregujGemItem;
import net.mcreator.modynasegreguj.item.SegregujAxeTool;
import net.mcreator.modynasegreguj.item.SegregujArmorArmorMaterial;
import net.mcreator.modynasegreguj.item.LotmodItemGroup;
import net.mcreator.modynasegreguj.block.SegregujOreBlockBlock;
import net.mcreator.modynasegreguj.block.SegregujOreBlock;

import net.fabricmc.fabric.api.event.world.WorldTickCallback;
import net.fabricmc.fabric.api.event.player.UseItemCallback;
import net.fabricmc.fabric.api.event.player.UseEntityCallback;
import net.fabricmc.fabric.api.event.player.UseBlockCallback;
import net.fabricmc.fabric.api.command.v1.CommandRegistrationCallback;
import net.fabricmc.api.ModInitializer;

public class ModyNaSegregujMod implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger();
	public static final Item SegregujGem_ITEM = Registry.register(Registry.ITEM, id("segreguj_gem"), new SegregujGemItem());
	public static final ItemGroup Lotmod = LotmodItemGroup.get();
	public static final Block SegregujOre_BLOCK = Registry.register(Registry.BLOCK, id("segreguj_ore"), new SegregujOreBlock());
	public static final BlockItem SegregujOre_ITEM = Registry.register(Registry.ITEM, id("segreguj_ore"),
			new BlockItem(SegregujOre_BLOCK, new Item.Settings().group(ModyNaSegregujMod.Lotmod)));
	public static final Block SegregujOreBlock_BLOCK = Registry.register(Registry.BLOCK, id("segreguj_ore_block"), new SegregujOreBlockBlock());
	public static final BlockItem SegregujOreBlock_ITEM = Registry.register(Registry.ITEM, id("segreguj_ore_block"),
			new BlockItem(SegregujOreBlock_BLOCK, new Item.Settings().group(ModyNaSegregujMod.Lotmod)));
	public static final Item SegregujArmor_HELMET = Registry.register(Registry.ITEM, id("segreguj_armor"),
			new ArmorItem(SegregujArmorArmorMaterial.SEGREGUJARMOR, EquipmentSlot.HEAD, (new Item.Settings().group(ItemGroup.COMBAT))));
	public static final Item SegregujArmor_CHESTPLATE = Registry.register(Registry.ITEM, id("segreguj_armor"),
			new ArmorItem(SegregujArmorArmorMaterial.SEGREGUJARMOR, EquipmentSlot.CHEST, (new Item.Settings().group(ItemGroup.COMBAT))));
	public static final Item SegregujArmor_LEGGINGS = Registry.register(Registry.ITEM, id("segreguj_armor"),
			new ArmorItem(SegregujArmorArmorMaterial.SEGREGUJARMOR, EquipmentSlot.LEGS, (new Item.Settings().group(ItemGroup.COMBAT))));
	public static final Item SegregujArmor_BOOTS = Registry.register(Registry.ITEM, id("segreguj_armor"),
			new ArmorItem(SegregujArmorArmorMaterial.SEGREGUJARMOR, EquipmentSlot.FEET, (new Item.Settings().group(ItemGroup.COMBAT))));
	public static final Item SegregujPickaxe_TOOL = Registry.register(Registry.ITEM, id("segreguj_pickaxe"), SegregujPickaxeTool.INSTANCE);
	public static final Item SegregujAxe_TOOL = Registry.register(Registry.ITEM, id("segreguj_axe"), SegregujAxeTool.INSTANCE);
	public static final Item SegregujSword_TOOL = Registry.register(Registry.ITEM, id("segreguj_sword"), SegregujSwordTool.INSTANCE);
	public static final Item SegregujShovel_TOOL = Registry.register(Registry.ITEM, id("segreguj_shovel"), SegregujShovelTool.INSTANCE);
	public static final Item SegregujHoe_TOOL = Registry.register(Registry.ITEM, id("segreguj_hoe"), SegregujHoeTool.INSTANCE);
	public void onInitialize() {
		LOGGER.info("[ModyNaSegregujMod] Initializing");
		WorldTickCallback.EVENT.register((world) -> {
		});
		UseBlockCallback.EVENT.register((player, world, hand, hitResult) -> {
			return ActionResult.PASS;
		});
		UseEntityCallback.EVENT.register((player, world, hand, entity, hitResult) -> {
			return ActionResult.PASS;
		});
		UseItemCallback.EVENT.register((player, world, hand) -> {
			return TypedActionResult.pass(player.getStackInHand(hand));
		});
		CommandRegistrationCallback.EVENT.register((dispatcher, dedicated) -> {
		});
	}

	public static final Identifier id(String s) {
		return new Identifier("mody_na_segreguj", s);
	}
}
