package ru.denik.world;

import java.util.*;

import cpw.mods.fml.common.*;
import net.minecraft.block.*;
import net.minecraft.init.*;
import net.minecraft.world.*;
import net.minecraft.world.chunk.*;
import net.minecraft.world.gen.feature.*;
import ru.denik.mod.*;
import ru.denik.mod.register.*;

public class OreWorldGenerator implements IWorldGenerator{
	
	public static RegisterBlocks registerBlocks;

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator,
			IChunkProvider chunkProvider) {
		switch(world.provider.dimensionId) {
		case 0:
			generateSurvace(random, chunkX * 16, chunkZ * 16, world);
			break;
		case -1:
		    generateNether(random, chunkX * 16, chunkZ * 16, world);
		    break;
		default:
			;
		}
		
	}
	public void addOre(Block block, Block blockSpawn, Random random, World world, int posX, int posZ, int minY, int maxY, int minVeinSize, int maxVeinSize, int spawnChance) {
		for(int i = 0; i < spawnChance; i++) {
			int defaultChunkSize = 16;
			
			int xPos = posX + random.nextInt(defaultChunkSize);
			int yPos = minY + random.nextInt(maxY - minY);
			int zPos = posZ + random.nextInt(defaultChunkSize);
			
			new WorldGenMinable(block, (minVeinSize + random.nextInt(maxVeinSize - minVeinSize)), blockSpawn).generate(world, random, xPos, yPos, zPos);
		}
	}
	public void generateNether(Random random, int chunkX, int chunkZ, World world) {
		addOre(registerBlocks.netherDiamondOre, Blocks.netherrack, random, world, chunkX, chunkZ, 5, 30, 2, 5, 5);
		addOre(registerBlocks.netherEmeraldOre, Blocks.netherrack, random, world, chunkX, chunkZ, 5, 25, 2, 4, 4);
		addOre(registerBlocks.netherGoldOre, Blocks.netherrack, random, world, chunkX, chunkZ, 12, 40, 4, 7, 8);
		addOre(registerBlocks.netherIronOre, Blocks.netherrack, random, world, chunkX, chunkZ, 18, 50, 4, 8, 20);
		addOre(registerBlocks.netherLapisOre, Blocks.netherrack, random, world, chunkX, chunkZ, 12, 30, 4, 6, 9);
		addOre(registerBlocks.netherRedstoneOre, Blocks.netherrack, random, world, chunkX, chunkZ, 11, 39, 4, 7, 11);
	}
	public void generateSurvace(Random random, int chunkX, int chunkZ, World world) {
		//ore
	       addOre(registerBlocks.leadOre, Blocks.stone, random, world, chunkX, chunkZ, 30, 47, 3, 6, 25);
	       
	    //block
	       addOre(registerBlocks.stoneAndesite, Blocks.stone, random, world, chunkX, chunkZ, 46, 70, 5, 16, 30);
	       addOre(registerBlocks.stoneDiorite, Blocks.stone, random, world, chunkX, chunkZ, 46, 70, 5, 16, 30);
	       addOre(registerBlocks.stoneGranite, Blocks.stone, random, world, chunkX, chunkZ, 46, 70, 5, 16, 30);
	       
		}
	
}
