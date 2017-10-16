package ru.denik.block;

import net.minecraft.block.*;
import net.minecraft.block.material.*;
import ru.denik.mod.MainClass;

public class NetherGoldOre extends Block {

	public NetherGoldOre() {
		super(Material.rock);
		setBlockName("NetherGoldOre");
		setCreativeTab(MainClass.tabMod);
		setHardness(4);
		setLightLevel(0.2F);
		setResistance(7);
		setHarvestLevel("pickaxe", 2);
	}

}
