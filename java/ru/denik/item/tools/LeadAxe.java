package ru.denik.item.tools;

import net.minecraft.item.*;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import ru.denik.mod.*;

public class LeadAxe extends ItemAxe {
	
	public static final ToolMaterial mat1 = EnumHelper.addToolMaterial("lead1", 2, 1005, 9, 0.5F, 24);

	public LeadAxe() {
		super(mat1);
		setCreativeTab(MainClass.tabMod);
	}

}
