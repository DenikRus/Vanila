package ru.denik.item.tools;

import net.minecraft.item.*;
import net.minecraft.item.Item.*;
import net.minecraftforge.common.util.*;
import ru.denik.mod.*;

public class LeadPickaxe extends ItemPickaxe{
	
	public static final ToolMaterial mat = EnumHelper.addToolMaterial("lead2", 2, 1205, 6, 0.5F, 24);

	public LeadPickaxe() {
		super(mat);
		setCreativeTab(MainClass.tabMod);
	}

}
