package ru.denik.block;

import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import ru.denik.mod.MainClass;

public class StoneAndesite extends Block{

	public StoneAndesite() {
		super(Material.rock);
		setCreativeTab(MainClass.tabMod);
		setHardness(6);
		setResistance(10F);
		setHarvestLevel("pickaxe", 0);
		setBlockName("stoneandesite");
	}

}
