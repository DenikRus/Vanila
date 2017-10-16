package ru.denik.mod;

import cpw.mods.fml.common.*;
import cpw.mods.fml.common.Mod.*;
import cpw.mods.fml.common.event.*;
import net.minecraft.creativetab.*;
import net.minecraftforge.common.*;
import ru.denik.mod.register.*;
import ru.denik.proxy.*;

@Mod (modid = "Vanila", name="Vanila", version = "1.0")
public class MainClass {
	
	@SidedProxy(clientSide = StringProxy.CLIENT_PROXY, serverSide = StringProxy.COMMON_PROXY)
	
	public static CommonProxy proxy;
	public static RegisterArmor reg_armor;
	public static RegisterBlocks reg_block;
	public static RegisterItems reg_item;
	public static RegisterRecipe reg_recipe;
	public static RegisterTools reg_tools;	
	
	//tabs
	public static CreativeTabs tabMod = new TabMod(CreativeTabs.getNextID(),"CreativeTab");
	
	@EventHandler
	public void preLoad(FMLPreInitializationEvent e) {		
		
		this.proxy.preLoad(e);
		this.reg_item.preLoad(e);
		this.reg_block.preLoad(e);
		this.reg_tools.preLoad(e);
		this.reg_armor.preLoad(e);
		
	}
	@EventHandler
	public void load(FMLInitializationEvent e) {		
		this.proxy.load(e);
		this.reg_recipe.load(e);
	
		MinecraftForge.EVENT_BUS.register(new DropEvent());
	}
		
}
