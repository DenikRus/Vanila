package ru.denik.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import ru.denik.mod.MainClass;

public class StoneDioriteSmooth extends Block{

	public StoneDioriteSmooth() {
		super(Material.rock);
		setCreativeTab(MainClass.tabMod);
		setHardness(6);
		setResistance(10);
		setHarvestLevel("pickaxe", 1);
		setBlockName("stonedioritesmooth");

	}

}
