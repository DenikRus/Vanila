package ru.denik.mod.register;

import cpw.mods.fml.common.event.*;
import cpw.mods.fml.common.registry.*;
import net.minecraft.item.*;
import net.minecraftforge.common.util.*;
import ru.denik.item.tools.*;

public class RegisterTools {
	
	//emerald
	public static Item emeraldSword = new EmeraldSword().setUnlocalizedName("emeraldsword");
	public static Item emeraldAxe = new EmeraldAxe().setUnlocalizedName("emeraldaxe");
	public static Item emeraldPickaxe = new EmeraldPickaxe().setUnlocalizedName("emeraldpickaxe");
	public static Item emeraldShovel = new EmeraldShovel().setUnlocalizedName("emeraldshovel");
	public static Item emeraldHoe = new EmeraldHoe().setUnlocalizedName("emeraldhoe");

	//lead
	public static Item leadSword = new LeadSword().setUnlocalizedName("leadsword");
	public static Item leadAxe = new LeadAxe().setUnlocalizedName("leadaxe");
	public static Item leadPickaxe = new LeadPickaxe().setUnlocalizedName("leadpickaxe");
	public static Item leadHoe = new LeadHoe().setUnlocalizedName("leadhoe");
	public static Item leadShovel = new LeadShovel().setUnlocalizedName("leadshovel");
	
	public static Item leadPickaxeBig = new LeadPickaxeBig(EnumHelper.addToolMaterial("lead", 5, 32547, 40, 2, 64)).
			setUnlocalizedName("leadpickaxebig");
	
	//quartz
	public static Item quartzSword = new QuartzSword().setUnlocalizedName("quartzsword");
	public static Item quartzAxe = new QuartzAxe().setUnlocalizedName("quartzaxe");
	public static Item quartzPickaxe = new QuartzPickaxe().setUnlocalizedName("quartzpickaxe");
	public static Item quartzShovel = new QuartzShovel().setUnlocalizedName("quartzshovel");
	public static Item quartzHoe = new QuartzHoe().setUnlocalizedName("quartzhoe");
	
	
	public static void preLoad(FMLPreInitializationEvent e) {
		/*
		 * SetTextureName
		 */
		//emerald
		emeraldSword.setTextureName("vanila:emerald_sword");
		emeraldAxe.setTextureName("vanila:emerald_axe");
		emeraldPickaxe.setTextureName("vanila:emerald_pickaxe");
		emeraldShovel.setTextureName("vanila:emerald_shovel");
		emeraldHoe.setTextureName("vanila:emerald_hoe");
		
		//lead
		leadSword.setTextureName("vanila:lead_sword");
		leadAxe.setTextureName("vanila:lead_axe");
		leadPickaxe.setTextureName("vanila:lead_pickaxe");
		leadHoe.setTextureName("vanila:lead_hoe");
		leadShovel.setTextureName("vanila:lead_shovel");
		
		leadPickaxeBig.setTextureName("vanila:lead_pickaxe_1");
		
		//quartz
		quartzSword.setTextureName("vanila:quartz_sword");
		quartzAxe.setTextureName("vanila:quartz_axe");
		quartzPickaxe.setTextureName("vanila:quartz_pickaxe");
		quartzShovel.setTextureName("vanila:quartz_shovel");
		quartzHoe.setTextureName("vanila:quartz_hoe");
		
		/*
		 * GameRegistry
		 */
		//emerald
		GameRegistry.registerItem(emeraldSword, "emerald_sword");
		GameRegistry.registerItem(emeraldAxe, "emerald_axe");
		GameRegistry.registerItem(emeraldPickaxe, "emerald_pickaxe");
		GameRegistry.registerItem(emeraldShovel, "emerald_shovel");
		GameRegistry.registerItem(emeraldHoe, "emerald_hoe");
		
		//lead
		GameRegistry.registerItem(leadSword, "lead_sword");
		GameRegistry.registerItem(leadAxe, "lead_axe");
		GameRegistry.registerItem(leadPickaxe, "lead_pickaxe");
		GameRegistry.registerItem(leadHoe, "lead_hoe");
		GameRegistry.registerItem(leadShovel, "lead_shovel");
		
		GameRegistry.registerItem(leadPickaxeBig, "lead_pickaxe_big");
		
		//quartz
		GameRegistry.registerItem(quartzSword, "quartz_sword");
		GameRegistry.registerItem(quartzAxe, "quartz_axe");
		GameRegistry.registerItem(quartzPickaxe, "quartz_pickaxe");
		GameRegistry.registerItem(quartzShovel, "quartz_shovel");
		GameRegistry.registerItem(quartzHoe, "quartz_hoe");
	}
}
