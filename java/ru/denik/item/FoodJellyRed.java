package ru.denik.item;

import net.minecraft.item.*;
import ru.denik.mod.MainClass;

public class FoodJellyRed extends ItemFood{
	
	public FoodJellyRed(String name, int par2, float par3, boolean par4) {
		super(par2, par4);
		setMaxStackSize(64);
		setAlwaysEdible();
		setCreativeTab(MainClass.tabMod);
	}

}
