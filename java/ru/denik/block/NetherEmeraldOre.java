package ru.denik.block;

import net.minecraft.block.*;
import net.minecraft.block.material.*;
import ru.denik.mod.MainClass;

public class NetherEmeraldOre extends Block {

	public NetherEmeraldOre() {
		super(Material.rock);
		setBlockName("NetherEmeraldOre");
		setCreativeTab(MainClass.tabMod);
		setHardness(3);
		setLightLevel(0.2F);
		setResistance(8);
		setHarvestLevel("pickaxe", 2);

	}

}
