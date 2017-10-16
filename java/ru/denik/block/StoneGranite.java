package ru.denik.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import ru.denik.mod.MainClass;

public class StoneGranite extends Block{

	public StoneGranite() {
		super(Material.rock);
		setCreativeTab(MainClass.tabMod);
		setHardness(6);
		setResistance(10);
		setHarvestLevel("pickaxe", 1);
		setBlockName("stonegranite");
	}

}
