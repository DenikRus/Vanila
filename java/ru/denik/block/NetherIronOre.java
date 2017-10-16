package ru.denik.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import ru.denik.mod.MainClass;

public class NetherIronOre extends Block {

	public NetherIronOre() {
		super(Material.rock);
		setBlockName("NetherIronOre");
		setCreativeTab(MainClass.tabMod);
		setHardness(3);
		setLightLevel(0.2F);
		setResistance(7);
		setHarvestLevel("pickaxe", 1);
	}

}
