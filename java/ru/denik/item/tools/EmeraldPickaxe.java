package ru.denik.item.tools;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemPickaxe;
import net.minecraftforge.common.util.EnumHelper;
import ru.denik.mod.MainClass;

public class EmeraldPickaxe extends ItemPickaxe {
	
	public static ToolMaterial mat = EnumHelper.addToolMaterial("emerald", 4, 1200, 10, 1, 25);

	public EmeraldPickaxe() {
		super(mat);
		setCreativeTab(MainClass.tabMod);
	
	}
	    
}
