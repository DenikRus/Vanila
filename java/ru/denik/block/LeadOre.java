package ru.denik.block;

import java.util.Random;

import net.minecraft.block.*;
import net.minecraft.block.material.*;
import net.minecraft.item.*;
import ru.denik.mod.*;

public class LeadOre extends Block{

	public LeadOre() {
		super(Material.rock);
		setCreativeTab(MainClass.tabMod);
		setHardness(2.0F);
		setLightLevel(0.3F);
		setResistance(4.0F);
		setHarvestLevel("pickaxe", 2);
		setBlockName("leadore");
	}

}
