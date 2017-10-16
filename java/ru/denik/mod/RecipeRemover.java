package ru.denik.mod;

import java.util.*;

import net.minecraft.block.Block;
import net.minecraft.item.*;
import net.minecraft.item.crafting.*;

public class RecipeRemover {
	
	public static void removeCrafting(Item item) {		
		List<IRecipe> recipes = CraftingManager.getInstance().getRecipeList();
		
		Iterator<IRecipe> remover = recipes.iterator();		
		while(remover.hasNext()) {
			ItemStack stack = remover.next().getRecipeOutput();
			if (stack != null && stack.getItem() == item) {
				remover.remove();
			}
		}
	}

	public static void removeCrafting(Block block) {
		List<IRecipe> recipes = CraftingManager.getInstance().getRecipeList();
		
		Iterator<IRecipe> remover = recipes.iterator();
		while(remover.hasNext()) {
			ItemStack stack = remover.next().getRecipeOutput();
			if (stack != null && block == block) {
				remover.remove();
			}
		}
		
	}

}
