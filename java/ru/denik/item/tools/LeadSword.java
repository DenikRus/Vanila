package ru.denik.item.tools;

import net.minecraft.item.*;
import net.minecraft.item.Item.ToolMaterial;
import ru.denik.mod.MainClass;
import net.minecraftforge.common.util.*;

public class LeadSword extends ItemSword {
	
	public static final ToolMaterial mat = EnumHelper.addToolMaterial("lead4", 2, 825, 3, 2, 38);

	public LeadSword() {
		super(LeadSword.mat);
		setCreativeTab(MainClass.tabMod);
	}


}
