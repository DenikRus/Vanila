package ru.denik.item;

import net.minecraft.item.*;
import ru.denik.mod.MainClass;

public class Monetka extends Item {
	
	public Monetka() { 
		setCreativeTab(MainClass.tabMod);
		setMaxStackSize(64);
		setUnlocalizedName("monetka");
	}

}
