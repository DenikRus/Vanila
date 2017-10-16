package ru.denik.block;

import net.minecraft.block.*;
import net.minecraft.block.material.*;
import ru.denik.mod.*;

public class NetherDiamondOre extends Block{

	public NetherDiamondOre() {
		super(Material.rock);
		setBlockName("NetherDiamondOre");
		setCreativeTab(MainClass.tabMod);
		setHardness(3);
		setLightLevel(0.2F);
		setResistance(7);
		setHarvestLevel("pickaxe", 2);
	}

}
