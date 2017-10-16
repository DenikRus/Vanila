package ru.denik.proxy;

import cpw.mods.fml.common.event.*;
import cpw.mods.fml.common.registry.*;
import net.minecraft.init.*;
import net.minecraft.item.*;
import ru.denik.mod.*;
import ru.denik.world.*;

public class CommonProxy {
	
	public static OreWorldGenerator oregen = new OreWorldGenerator();

	public void preLoad(FMLPreInitializationEvent e) {
		
		GameRegistry.registerWorldGenerator(oregen, 0);
		
	}

	public void load(FMLInitializationEvent e) {
		
		//items
		RecipeRemover.removeCrafting(Items.book);
		
		//blocks
		RecipeRemover.removeCrafting(Blocks.chest);
		RecipeRemover.removeCrafting(Blocks.gold_block);
		RecipeRemover.removeCrafting(Blocks.diamond_block);
		RecipeRemover.removeCrafting(Blocks.lapis_block);
	}


}
