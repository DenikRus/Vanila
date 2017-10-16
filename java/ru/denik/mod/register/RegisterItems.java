package ru.denik.mod.register;

import cpw.mods.fml.common.event.*;
import cpw.mods.fml.common.registry.*;
import net.minecraft.item.*;
import ru.denik.item.*;

public class RegisterItems {
	
	//food
	public static Item applelapiz = new AppleBlue(6, 3, 0.5F, true).setUnlocalizedName("lapisapple");
	public static Item cookedflesh = new CookedFlesh(2, 2, 0.5F, false).setUnlocalizedName("cookedflesh");
	public static Item foodMutton = new FoodMutton(3, 1, 0.5F, true).setUnlocalizedName("foodmutton");
	public static Item foodcookedmutton = new FoodCookedMutton(4, 2, 0.5F, true).setUnlocalizedName("cookedmutton");
	public static Item foodJelly = new FoodJelly("foodjelly", 1, 0.5F, false).setUnlocalizedName("foodjelly");
	public static Item foodJellyRed = new FoodJellyRed("foodjellyred", 2, 0.8F, false).setUnlocalizedName("foodjellyred");
	public static Item foodJellyYellow = new FoodJellyYellow("foodjellyyellow", 2, 0.7F, false).setUnlocalizedName("foodjellyyellow");
	public static Item foodJellyViolet = new FoodJellyViolet("foodjellyviolet", 2, 0.6F, false).setUnlocalizedName("foodjellyviolet");

	//item
	public static Item leadIngot = new LeadIngot().setUnlocalizedName("leadingot");
	
	public static Item monetka = new Monetka();

	public static void preLoad(FMLPreInitializationEvent e) {	
		/*
		 * SetTextureName
		 */
		//food
		applelapiz.setTextureName("vanila:apple_blue");	
		cookedflesh.setTextureName("vanila:cooked_Flesh");
		foodMutton.setTextureName("vanila:item_mutton");
		foodcookedmutton.setTextureName("vanila:CookedMutton");
		foodJelly.setTextureName("vanila:itemJelly");
		foodJellyRed.setTextureName("vanila:itemJellyRed");
		foodJellyYellow.setTextureName("vanila:itemJellyYellow");
		foodJellyViolet.setTextureName("vanila:itemJellyViolet");	
		
		//items		
		leadIngot.setTextureName("vanila:lead_ingot");
		monetka.setTextureName("vanila:monetka");
		
		/*
		 * Register
		 */
		//food
		GameRegistry.registerItem(applelapiz, "lapiz_apple");
		GameRegistry.registerItem(cookedflesh, "cooked_flesh");
		GameRegistry.registerItem(foodMutton, "food_mutton");
		GameRegistry.registerItem(foodcookedmutton, "cooked_mutton");
		GameRegistry.registerItem(foodJelly, "food_jelly");
		GameRegistry.registerItem(foodJellyRed, "food_jelly_red");
		GameRegistry.registerItem(foodJellyYellow, "food_jelly_yellow");
		GameRegistry.registerItem(foodJellyViolet, "food_jelly_violet");
		
		//items
		GameRegistry.registerItem(leadIngot, "lead_ingot");
		
		GameRegistry.registerItem(monetka, "monetka");
		
	}
	
}
