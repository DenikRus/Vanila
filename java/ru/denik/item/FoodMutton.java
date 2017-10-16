package ru.denik.item;

import net.minecraft.entity.passive.*;
import net.minecraft.item.*;
import net.minecraftforge.event.entity.living.*;
import ru.denik.mod.MainClass;

public class FoodMutton extends ItemFood {

	public FoodMutton(int par1,int par2, float par3, boolean par4) {
		super(par1, par2, par4);
		setMaxStackSize(64);
		setCreativeTab(MainClass.tabMod);
	}

}
