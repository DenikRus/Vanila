package ru.denik.item.tools;

import net.minecraft.item.*;
import net.minecraftforge.common.util.*;
import ru.denik.mod.*;

public class LeadShovel extends ItemSpade{
	
	public static ToolMaterial mat = EnumHelper.addToolMaterial("lead", 2, 1010, 7, 0.5F, 18);

	public LeadShovel() {
		super(mat);
		setCreativeTab(MainClass.tabMod);
	}

}
