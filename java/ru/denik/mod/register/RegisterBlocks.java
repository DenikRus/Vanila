package ru.denik.mod.register;

import cpw.mods.fml.common.event.*;
import cpw.mods.fml.common.registry.*;
import net.minecraft.block.*;
import ru.denik.block.*;

public class RegisterBlocks {
	
	//ore
	public static Block leadOre = new LeadOre();
	public static Block netherDiamondOre = new NetherDiamondOre();
	public static Block netherEmeraldOre = new NetherEmeraldOre();
	public static Block netherGoldOre = new NetherGoldOre();
	public static Block netherIronOre = new NetherIronOre();
	public static Block netherLapisOre = new NetherLapisOre();
	public static Block netherRedstoneOre = new NetherRedstoneOre();
	
	//block	
	public static Block leadBlock = new LeadBlock();
	public static Block stoneAndesite = new StoneAndesite();
	public static Block stoneAndesiteSmooth = new StoneAndesiteSmooth();
	public static Block stoneDiorite = new StoneDiorite();
	public static Block stoneDioriteSmooth = new StoneDioriteSmooth();
	public static Block stoneGranite = new StoneGranite();
	public static Block stoneGraniteSmooth = new StoneGraniteSmooth();
	
	public static void preLoad(FMLPreInitializationEvent e) {
		/*
		 * SetTextureName
		 */
		
		//ore
		leadOre.setBlockTextureName("vanila:lead_ore");
		netherDiamondOre.setBlockTextureName("vanila:nether_diamond");
		netherEmeraldOre.setBlockTextureName("vanila:nether_emerald");
		netherGoldOre.setBlockTextureName("vanila:nether_gold");
		netherIronOre.setBlockTextureName("vanila:nether_iron");
		netherLapisOre.setBlockTextureName("vanila:nether_lapis");
		netherRedstoneOre.setBlockTextureName("vanila:nether_redstone");
		
		//block
		leadBlock.setBlockTextureName("vanila:lead_block");
		stoneAndesite.setBlockTextureName("vanila:stone_andesite");
		stoneAndesiteSmooth.setBlockTextureName("vanila:stone_andesite_smooth");
		stoneDiorite.setBlockTextureName("vanila:stone_diorite");
		stoneDioriteSmooth.setBlockTextureName("vanila:stone_diorite_smooth");
		stoneGranite.setBlockTextureName("vanila:stone_granite");
		stoneGraniteSmooth.setBlockTextureName("vanila:stone_granite_smooth");
		
		/*
		 * GameRegistry
		 */
		
		//ore
		GameRegistry.registerBlock(leadOre, "lead_ore");	
		GameRegistry.registerBlock(netherDiamondOre, "nether_diamond");
		GameRegistry.registerBlock(netherEmeraldOre, "nether_emerald");
		GameRegistry.registerBlock(netherGoldOre, "nether_gold");
		GameRegistry.registerBlock(netherIronOre, "nether_iron");
		GameRegistry.registerBlock(netherLapisOre, "nether_lapis");
		GameRegistry.registerBlock(netherRedstoneOre, "nether_redstone");
		
		//block
		GameRegistry.registerBlock(leadBlock, "lead_block");	
		GameRegistry.registerBlock(stoneAndesite, "stone_andesite");
		GameRegistry.registerBlock(stoneAndesiteSmooth, "stone_andesite_smooth");
		GameRegistry.registerBlock(stoneDiorite, "stone_diorite");
		GameRegistry.registerBlock(stoneDioriteSmooth, "stone_diorite_smooth");
		GameRegistry.registerBlock(stoneGranite, "stone_granite");
		GameRegistry.registerBlock(stoneGraniteSmooth, "stone_granite_smooth");
		}

}
