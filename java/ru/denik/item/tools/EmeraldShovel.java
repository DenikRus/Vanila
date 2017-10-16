package ru.denik.item.tools;

import net.minecraft.item.*;
import net.minecraftforge.common.util.*;
import ru.denik.mod.*;

public class EmeraldShovel extends ItemSpade{
	
	public static ToolMaterial mat = EnumHelper.addToolMaterial("emerald", 4, 950, 9, 1, 30);

	public EmeraldShovel() {
		super(mat);
		setCreativeTab(MainClass.tabMod);
	}

}
