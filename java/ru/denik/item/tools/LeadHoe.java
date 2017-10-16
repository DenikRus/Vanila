package ru.denik.item.tools;

import net.minecraft.item.*;
import net.minecraftforge.common.util.*;
import ru.denik.mod.*;

public class LeadHoe extends ItemHoe {
	
	public static ToolMaterial mat = EnumHelper.addToolMaterial("lead3", 2, 1205, 6, 0.5F, 24);

	public LeadHoe() {
		super(mat);
		setCreativeTab(MainClass.tabMod);
	}

}
