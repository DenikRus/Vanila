package ru.denik.mod.register;

import cpw.mods.fml.common.event.*;
import cpw.mods.fml.common.registry.*;
import net.minecraft.item.*;
import ru.denik.item.armor.*;

public class RegisterArmor {

	//emerald
	public static Item emeraldHelmet = new EmeraldArmor(0, 0).setUnlocalizedName("emeraldhelmet");
	public static Item emeraldChestplate = new EmeraldArmor(0, 1).setUnlocalizedName("emeraldchestplate");
	public static Item emeraldLeggings = new EmeraldArmor(0, 2).setUnlocalizedName("emeraldleggings");
	public static Item emeraldBoots = new EmeraldArmor(0, 3).setUnlocalizedName("emeraldboots");
	
	//lead
	public static Item leadHelmet = new LeadArmor(0, 0).setUnlocalizedName("leadhelmet");
	public static Item leadChestplate = new LeadArmor(0, 1).setUnlocalizedName("leadchestplate");
	public static Item leadLeggings = new LeadArmor(0, 2).setUnlocalizedName("leadleggings");
	public static Item leadBoots = new LeadArmor(0, 3).setUnlocalizedName("leadboots");
	
	//ground
	public static Item groundHelmet = new GroundArmor(0, 0).setUnlocalizedName("groundhelmet");
	public static Item groundChestplate = new GroundArmor(0, 1).setUnlocalizedName("groundchestplate");
	public static Item groundLeggings = new GroundArmor(0, 2).setUnlocalizedName("groundleggings");
	public static Item groundBoots = new GroundArmor(0, 3).setUnlocalizedName("groundboots");
	
	public static void preLoad(FMLPreInitializationEvent e) {
		/*
		 * SetTextureName
		 */
		//emerald
		emeraldHelmet.setTextureName("vanila:emerald_helmet");
		emeraldChestplate.setTextureName("vanila:emerald_chestplate");
		emeraldLeggings.setTextureName("vanila:emerald_leggings");
		emeraldBoots.setTextureName("vanila:emerald_boots");
		
		//lead
		leadHelmet.setTextureName("vanila:lead_helmet");
		leadChestplate.setTextureName("vanila:lead_chestplate");
		leadLeggings.setTextureName("vanila:lead_leggings");
		leadBoots.setTextureName("vanila:lead_boots");
		
		//ground
		groundHelmet.setTextureName("vanila:ground_helmet");
		groundChestplate.setTextureName("vanila:ground_chestplate");
		groundLeggings.setTextureName("vanila:ground_leggings");
		groundBoots.setTextureName("vanila:ground_boots");
		
		/*
		 * GameRegistry
		 */
		//emerald
		GameRegistry.registerItem(emeraldHelmet, "emerald_helmet");
		GameRegistry.registerItem(emeraldChestplate, "emerald_chestplate");
		GameRegistry.registerItem(emeraldLeggings, "emerald_leggings");
		GameRegistry.registerItem(emeraldBoots, "emerald_boots");
		
		//lead
		GameRegistry.registerItem(leadHelmet, "lead_helmet");
		GameRegistry.registerItem(leadChestplate, "lead_chestplate");
		GameRegistry.registerItem(leadLeggings, "lead_leggings");
		GameRegistry.registerItem(leadBoots, "lead_boots");	
		
		//ground
		GameRegistry.registerItem(groundHelmet, "ground_helmet");
		GameRegistry.registerItem(groundChestplate, "ground_chestplate");
		GameRegistry.registerItem(groundLeggings, "ground_leggings");
		GameRegistry.registerItem(groundBoots, "ground_boots");
	}
}
