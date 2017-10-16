package ru.denik.item.tools;

import net.minecraft.item.*;
import net.minecraftforge.common.util.*;
import ru.denik.mod.MainClass;

public class QuartzAxe extends ItemAxe {
	
	public static ToolMaterial mat = EnumHelper.addToolMaterial("quartz", 2, 540, 5.0F, 0.5F, 24);

	public QuartzAxe() {
		super(mat);
		setCreativeTab(MainClass.tabMod);
		setMaxStackSize(1);
	}

}
