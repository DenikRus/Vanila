package ru.denik.item.tools;

import net.minecraft.item.*;
import net.minecraftforge.common.util.*;
import ru.denik.mod.*;

public class QuartzSword extends ItemSword {
	
	public static ToolMaterial mat = EnumHelper.addToolMaterial("quartz", 2, 560, 5.0F, 0.4F, 18);

	public QuartzSword() {
		super(mat);
		setCreativeTab(MainClass.tabMod);
		setMaxStackSize(1);
	}

}
