package ru.denik.item.tools;

import net.minecraft.item.*;
import net.minecraft.world.World;
import net.minecraftforge.common.util.*;
import ru.denik.mod.*;

public class EmeraldAxe extends ItemAxe {
	
	public static ToolMaterial mat = EnumHelper.addToolMaterial("emerald", 2, 1000, 4.0F, 1, 28);

	public EmeraldAxe() {
		super(mat);
		setCreativeTab(MainClass.tabMod);
	}

}
