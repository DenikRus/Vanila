package ru.denik.mod.register;

import cpw.mods.fml.common.event.*;
import cpw.mods.fml.common.registry.*;
import net.minecraft.init.*;
import net.minecraft.item.*;
import ru.denik.item.*;

public class RegisterRecipe {
	
	public static RegisterItems registerItems;
	public static RegisterBlocks registerBlocks;
	public static RegisterTools registerTools;
	public static RegisterArmor registerArmor;

	public static void load(FMLInitializationEvent e) {
		/*
		 * Minecraft
		 */
		//items
		GameRegistry.addRecipe(new ItemStack(Items.book),
				new Object[]{ "AA ", "BA ", "BA ",				
				('A'), Items.paper, ('B'), Items.leather});
		GameRegistry.addRecipe(new ItemStack(Items.iron_ingot),
				new Object[]{ " A ", "ABA", " A ",				
				('A'), Items.coal, ('B'), new ItemStack(Items.dye, 1, 15)});
		GameRegistry.addRecipe(new ItemStack(Items.diamond),
				new Object[]{ " A ", "ABA", " A ",				
				('A'), Items.iron_ingot, ('B'), Items.gold_ingot});
		GameRegistry.addRecipe(new ItemStack(Items.emerald),
				new Object[]{ " A ", "ABA", " A ",				
				('A'), Items.diamond, ('B'), new ItemStack(Items.dye, 1, 2)});
		
		//eggs
		GameRegistry.addRecipe(new ItemStack(Items.spawn_egg, 1, 50),
				new Object[]{ "AAA", "ABA", "AAA",				
				('A'), Items.gunpowder, ('B'), Blocks.tnt});
		GameRegistry.addRecipe(new ItemStack(Items.spawn_egg, 1, 51),
				new Object[]{ "AAA", "ABA", "AAA",				
				('A'), Items.bone, ('B'), Items.bow});
		GameRegistry.addRecipe(new ItemStack(Items.spawn_egg, 1, 52),
				new Object[]{ "AAA", "ABA", "AAA",				
				('A'), Items.string, ('B'), Items.spider_eye});
		GameRegistry.addRecipe(new ItemStack(Items.spawn_egg, 1, 54),
				new Object[]{ "AAA", "ABA", "AAA",				
				('A'), Items.rotten_flesh, ('B'), new ItemStack(Items.skull, 1, 2)});
		GameRegistry.addRecipe(new ItemStack(Items.spawn_egg, 1, 55),
				new Object[]{ "AAA", "ABA", "AAA",				
				('A'), Items.slime_ball, ('B'), registerItems.foodJelly});
		GameRegistry.addRecipe(new ItemStack(Items.spawn_egg, 1, 56),
				new Object[]{ "AAA", "ABA", "AAA",				
				('A'), Items.gunpowder, ('B'), Items.ghast_tear});
		GameRegistry.addRecipe(new ItemStack(Items.spawn_egg, 1, 57),
				new Object[]{ "AAA", "ABA", "AAA",				
				('A'), Items.gold_nugget, ('B'), new ItemStack(Items.spawn_egg, 1, 54)});
		GameRegistry.addRecipe(new ItemStack(Items.spawn_egg, 1, 58),
				new Object[]{ "AAA", "ABA", "AAA",				
				('A'), Items.ender_pearl, ('B'), Items.ender_eye});
		GameRegistry.addRecipe(new ItemStack(Items.spawn_egg, 1, 59),
				new Object[]{ "AAA", "ABA", "AAA",				
				('A'), Items.spider_eye, ('B'), Items.fermented_spider_eye});
		GameRegistry.addRecipe(new ItemStack(Items.spawn_egg, 1, 60),
				new Object[]{ "AAA", "ABA", "AAA",				
				('A'), Items.blaze_rod, ('B'), Items.fire_charge});
		GameRegistry.addRecipe(new ItemStack(Items.spawn_egg, 1, 62),
				new Object[]{ "AAA", "ABA", "AAA",				
				('A'), Items.slime_ball, ('B'), Items.magma_cream});
		GameRegistry.addRecipe(new ItemStack(Items.spawn_egg, 1, 66),
				new Object[]{ "AAA", "ABA", "AAA",				
				('A'), Items.sugar, ('B'), Items.glass_bottle});
		GameRegistry.addRecipe(new ItemStack(Items.spawn_egg, 1, 90),
				new Object[]{ "AAA", "A A", "AAA",				
				('A'), Items.porkchop});
		GameRegistry.addRecipe(new ItemStack(Items.spawn_egg, 1, 91),
				new Object[]{ "AAA", "A A", "AAA",				
				('A'), registerItems.foodMutton});
		GameRegistry.addRecipe(new ItemStack(Items.spawn_egg, 1, 92),
				new Object[]{ "AAA", "A A", "AAA",				
				('A'), Items.beef});
		GameRegistry.addRecipe(new ItemStack(Items.spawn_egg, 1, 93),
				new Object[]{ "AAA", "A A", "AAA",				
				('A'), Items.chicken});
		GameRegistry.addRecipe(new ItemStack(Items.spawn_egg, 1, 94),
				new Object[]{ "AAA", "A A", "AAA",				
				('A'), Items.dye});
		GameRegistry.addRecipe(new ItemStack(Items.spawn_egg, 1, 96),
				new Object[]{ "AAA", "A A", "AAA",				
				('A'), Items.mushroom_stew});
		GameRegistry.addRecipe(new ItemStack(Items.spawn_egg, 1, 120),
				new Object[]{ "AAA", "ABA", "AAA",				
				('A'), Items.book, ('B'), new ItemStack(Items.skull, 1 , 3)});
		
		
		//blocks
		GameRegistry.addRecipe(new ItemStack(Blocks.chest),
				new Object[]{ "AAA", "ABA", "AAA",				
				('A'), Blocks.planks, ('B'), Items.iron_ingot});
		GameRegistry.addRecipe(new ItemStack(Blocks.gold_block),
				new Object[]{ "AAA", "ABA", "AAA",				
				('A'), Items.gold_ingot, ('B'), Blocks.iron_block});
		GameRegistry.addRecipe(new ItemStack(Blocks.diamond_block),
				new Object[]{ "AAA", "ABA", "AAA",				
				('A'), Items.diamond, ('B'), Blocks.gold_block});
		GameRegistry.addRecipe(new ItemStack(Blocks.lapis_block),
				new Object[]{ "AAA", "ABA", "AAA",				
				('A'), new ItemStack(Items.dye, 1 , 4), ('B'), Blocks.gold_block});
		
		/*
		 * Register crafting of mod
		 */
		//food
		//applelapis
		GameRegistry.addRecipe(new ItemStack(registerItems.applelapiz, 2),
				new Object[]{ "AAA", "ABA", "AAA",				
				('A'), new ItemStack(Blocks.lapis_block), ('B'), Items.apple});
		//Jelly
		GameRegistry.addShapelessRecipe(new ItemStack(registerItems.foodJelly),
				new Object[] { Items.slime_ball, Items.slime_ball, Items.slime_ball, Items.slime_ball});
		GameRegistry.addShapelessRecipe(new ItemStack(registerItems.foodJellyRed, 2),
				new Object[] { registerItems.foodJelly, new ItemStack(Items.dye, 1, 1)});
		GameRegistry.addShapelessRecipe(new ItemStack(registerItems.foodJellyYellow),
				new Object[] { registerItems.foodJelly, new ItemStack(Items.dye, 1, 11)});
		GameRegistry.addShapelessRecipe(new ItemStack(registerItems.foodJellyViolet),
				new Object[] { registerItems.foodJelly, new ItemStack(Items.dye, 1, 5)});
		
		/*
		 * tools
		 */
		
		//emerald
		//Sword
		GameRegistry.addRecipe(new ItemStack(registerTools.emeraldSword),
				new Object[]{ " A ", " A ", " B ",
				('A'), Items.emerald, ('B'), Items.stick});
		//Axe
		GameRegistry.addRecipe(new ItemStack(registerTools.emeraldAxe),
				new Object[]{ "AA ", "AB ", " B ",
				('A'), Items.emerald, ('B'), Items.stick});
		//Pickaxe
		GameRegistry.addRecipe(new ItemStack(registerTools.emeraldPickaxe),
				new Object[]{ "AAA", " B ", " B ",
				('A'), Items.emerald, ('B'), Items.stick});
		//Shovel
		GameRegistry.addRecipe(new ItemStack(registerTools.emeraldShovel),
				new Object[]{ " A ", " B ", " B ",
				('A'), Items.emerald, ('B'), Items.stick});
		//Hoe
		GameRegistry.addRecipe(new ItemStack(registerTools.emeraldHoe),
				new Object[]{ "AA ", " B ", " B ",
				('A'), Items.emerald, ('B'), Items.stick});
		
		//lead
		//Sword
		GameRegistry.addRecipe(new ItemStack(registerTools.leadSword),
				new Object[]{ " A ", " A ", " B ",
				('A'), new ItemStack(registerItems.leadIngot), ('B'), Items.stick});	
		//Axe
		GameRegistry.addShapelessRecipe(new ItemStack(registerTools.leadAxe),
				new Object[] { registerItems.leadIngot, registerItems.leadIngot, registerItems.leadIngot, 
						Items.stick, Items.stick});
		//Pickaxe
		GameRegistry.addRecipe(new ItemStack(registerTools.leadPickaxe),
				new Object[]{ "AAA", " B ", " B ",
				('A'), new ItemStack(registerItems.leadIngot), ('B'), Items.stick});	
		//Hoe
		GameRegistry.addShapelessRecipe(new ItemStack(registerTools.leadHoe),
				new Object[] { registerItems.leadIngot, registerItems.leadIngot, Items.stick, Items.stick});
		//Shovel
		GameRegistry.addRecipe(new ItemStack(registerTools.leadShovel),
				new Object[]{ " A ", " B ", " B ",
				('A'), new ItemStack(registerItems.leadIngot), ('B'), Items.stick});
		
		//quartz
		//Sword
		GameRegistry.addRecipe(new ItemStack(registerTools.quartzSword),
				new Object[] { " A ", " A ", " B ",
				('A'), Items.quartz, ('B'), Items.stick});
		//Axe
		GameRegistry.addShapelessRecipe(new ItemStack(registerTools.quartzAxe),
				new Object[] { Items.quartz, Items.quartz, Items.quartz, Items.stick, Items.stick});
		//Pickaxe
		GameRegistry.addRecipe(new ItemStack(registerTools.quartzPickaxe),
				new Object[] { "AAA", " B ", " B ",
				('A'), Items.quartz, ('B'), Items.stick});
		//Shovel
		GameRegistry.addRecipe(new ItemStack(registerTools.quartzShovel),
				new Object[] { " A ", " B ", " B ",
				('A'), Items.quartz, ('B'), Items.stick});
		//Hoe
		GameRegistry.addShapelessRecipe(new ItemStack(registerTools.quartzHoe),
				new Object[] { Items.quartz, Items.quartz, Items.stick, Items.stick});
		
		/*
		 * armors
		 */
		
		//emerald
		GameRegistry.addShapelessRecipe(new ItemStack(registerArmor.emeraldHelmet),
				new Object[] { Items.emerald, Items.emerald, Items.emerald, Items.emerald, Items.emerald});
		GameRegistry.addRecipe(new ItemStack(registerArmor.emeraldChestplate),
				new Object[]{ "A A", "AAA", "AAA",
				('A'), Items.emerald});
		GameRegistry.addRecipe(new ItemStack(registerArmor.emeraldLeggings),
				new Object[]{ "AAA", "A A", "A A",
				('A'), Items.emerald});
		GameRegistry.addShapelessRecipe(new ItemStack(registerArmor.emeraldBoots),
				new Object[] { Items.emerald, Items.emerald, Items.emerald, Items.emerald});
		
		//lead
		GameRegistry.addShapelessRecipe(new ItemStack(registerArmor.leadHelmet),
				new Object[] { registerItems.leadIngot, registerItems.leadIngot, 
						registerItems.leadIngot, registerItems.leadIngot, registerItems.leadIngot});
		GameRegistry.addRecipe(new ItemStack(registerArmor.leadChestplate),
				new Object[]{ "A A", "AAA", "AAA",
				('A'), registerItems.leadIngot});
		GameRegistry.addRecipe(new ItemStack(registerArmor.leadLeggings),
				new Object[]{ "AAA", "A A", "A A",
				('A'), registerItems.leadIngot});
		GameRegistry.addShapelessRecipe(new ItemStack(registerArmor.leadBoots),
				new Object[] { registerItems.leadIngot, registerItems.leadIngot,
						registerItems.leadIngot, registerItems.leadIngot});
		
		//ground
		GameRegistry.addShapelessRecipe(new ItemStack(registerArmor.groundHelmet),
				new Object[] { Blocks.dirt, Blocks.dirt, Blocks.dirt, Blocks.dirt, Blocks.dirt});
		GameRegistry.addRecipe(new ItemStack(registerArmor.groundChestplate),
				new Object[]{ "A A", "AAA", "AAA",
				('A'), Blocks.dirt});
		GameRegistry.addRecipe(new ItemStack(registerArmor.groundLeggings),
				new Object[]{ "AAA", "A A", "A A",
				('A'), Blocks.dirt});
		GameRegistry.addShapelessRecipe(new ItemStack(registerArmor.groundBoots),
				new Object[] { Blocks.dirt, Blocks.dirt, Blocks.dirt, Blocks.dirt});
		
		/*
		 * blocks
		 */
		
		//lead		
		GameRegistry.addRecipe(new ItemStack(registerBlocks.leadBlock),
				new Object[]{ "AAA", "AAA", "AAA",
				('A'), new ItemStack(registerItems.leadIngot)});
		
		//andesite
		GameRegistry.addShapelessRecipe(new ItemStack(registerBlocks.stoneAndesiteSmooth),
				new Object[] { registerBlocks.stoneAndesite, registerBlocks.stoneAndesite,
						registerBlocks.stoneAndesite, registerBlocks.stoneAndesite});	
		//diorite
		GameRegistry.addShapelessRecipe(new ItemStack(registerBlocks.stoneDioriteSmooth),
				new Object[] { registerBlocks.stoneDiorite, registerBlocks.stoneDiorite,
						registerBlocks.stoneDiorite, registerBlocks.stoneDiorite});
		//granite
		GameRegistry.addShapelessRecipe(new ItemStack(registerBlocks.stoneGraniteSmooth),
				new Object[] { registerBlocks.stoneGranite, registerBlocks.stoneGranite, 
						registerBlocks.stoneGranite, registerBlocks.stoneGranite});

		
		/*
		 * Register furnace recipe
		 */
		//ore
		//lead
		GameRegistry.addSmelting(registerBlocks.leadOre, new ItemStack(registerItems.leadIngot, 2), 1);
		//nether
		GameRegistry.addSmelting(registerBlocks.netherDiamondOre, new ItemStack(Items.diamond, 2), 2);
		GameRegistry.addSmelting(registerBlocks.netherEmeraldOre, new ItemStack(Items.emerald, 2), 2);
		GameRegistry.addSmelting(registerBlocks.netherGoldOre, new ItemStack(Items.gold_ingot, 2), 2);
		GameRegistry.addSmelting(registerBlocks.netherIronOre, new ItemStack(Items.iron_ingot), 2);

		
		//1..1
		//flint
		GameRegistry.addSmelting(Blocks.gravel, new ItemStack(Items.flint), 0.3F);
		//food
		GameRegistry.addSmelting(Items.rotten_flesh, new ItemStack(registerItems.cookedflesh), 0.3F);
		GameRegistry.addSmelting(registerItems.foodMutton, new ItemStack(registerItems.foodcookedmutton), 0.5F);
	}

}
