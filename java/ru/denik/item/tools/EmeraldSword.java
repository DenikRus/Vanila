package ru.denik.item.tools;

import net.minecraft.item.*;
import net.minecraft.item.Item.*;
import net.minecraftforge.common.util.*;
import ru.denik.mod.*;

public class EmeraldSword extends ItemSword {
	
	public static final ToolMaterial mat = EnumHelper.addToolMaterial("emerald", 2, 1350, 4, 5, 50);

	public EmeraldSword() {
		super(mat);
		setCreativeTab(MainClass.tabMod);
	}

}
