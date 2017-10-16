package ru.denik.mod;

import cpw.mods.fml.relauncher.*;
import net.minecraft.block.*;
import net.minecraft.creativetab.*;
import net.minecraft.init.Items;
import net.minecraft.item.*;
import ru.denik.mod.register.RegisterItems;

public class TabMod extends CreativeTabs {
	
	public TabMod(int position, String tabID) {
	super(position, tabID);
	}
	@Override
	public Item getTabIconItem() {
		return RegisterItems.applelapiz;
	}
}
	