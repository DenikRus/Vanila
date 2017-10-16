package ru.denik.item;

import net.minecraft.item.*;
import ru.denik.mod.*;

public class CookedFlesh extends ItemFood {

	public CookedFlesh(int par1,int par2, float par3, boolean par4) {
		super(par1, par2, par4);
		setCreativeTab(MainClass.tabMod);
		setMaxStackSize(64);
	}

}
