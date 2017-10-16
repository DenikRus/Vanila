package ru.denik.item.tools;

import net.minecraft.item.ItemPickaxe;
import net.minecraftforge.common.util.*;
import ru.denik.mod.*;

public class QuartzPickaxe extends ItemPickaxe {
	
	static ToolMaterial mat = EnumHelper.addToolMaterial("quartz", 2, 546, 5.0F, 0.3F, 32);

	public QuartzPickaxe() {
		super(mat);
		setCreativeTab(MainClass.tabMod);
		setMaxStackSize(1);
	}

}
