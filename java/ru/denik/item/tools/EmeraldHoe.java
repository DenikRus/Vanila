package ru.denik.item.tools;

import net.minecraft.item.*;
import net.minecraftforge.common.util.*;
import ru.denik.mod.*;

public class EmeraldHoe extends ItemHoe {
	
	public static ToolMaterial mat = EnumHelper.addToolMaterial("emerald", 3, 1025, 9, 1, 28);

	public EmeraldHoe() {
		super(mat);
		setCreativeTab(MainClass.tabMod);
	}

}
