package ru.denik.item.tools;

import net.minecraft.item.*;
import net.minecraftforge.common.util.*;
import ru.denik.mod.MainClass;

public class QuartzShovel extends ItemSpade {
	
	static ToolMaterial mat = EnumHelper.addToolMaterial("quartz", 2, 520, 5.0F, 0.4F, 24);

	public QuartzShovel() {
		super(mat);
		setCreativeTab(MainClass.tabMod);
		setMaxStackSize(1);
	}

}
