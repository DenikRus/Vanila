package ru.denik.item;

import net.minecraft.item.*;
import ru.denik.mod.MainClass;

public class FoodCookedMutton extends ItemFood {

	public FoodCookedMutton(int par1,int par2, float par3, boolean par4) {
		super(par1, par2, par4);
		setMaxStackSize(64);
		setCreativeTab(MainClass.tabMod);
	}

}
