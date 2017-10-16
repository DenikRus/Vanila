package ru.denik.item.tools;

import net.minecraft.item.*;
import net.minecraftforge.common.util.*;
import ru.denik.mod.MainClass;

public class QuartzHoe extends ItemHoe {
	
	static ToolMaterial mat = EnumHelper.addToolMaterial("quartz", 2, 520, 4.5F, 0.4F, 23);

	public QuartzHoe() {
		super(mat);
		setCreativeTab(MainClass.tabMod);
		setMaxStackSize(1);
	}

}
