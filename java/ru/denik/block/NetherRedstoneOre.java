package ru.denik.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import ru.denik.mod.MainClass;

public class NetherRedstoneOre extends Block {

	public NetherRedstoneOre() {
		super(Material.rock);
		setBlockName("NetherRedstoneOre");
		setCreativeTab(MainClass.tabMod);
		setHardness(3);
		setLightLevel(0.2F);
		setResistance(7);
		setHarvestLevel("pickaxe", 2);
	}

}
