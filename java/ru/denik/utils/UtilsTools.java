package ru.denik.utils;

import net.minecraft.entity.*;
import net.minecraft.entity.player.*;
import net.minecraft.item.*;
import net.minecraft.util.*;
import net.minecraft.world.*;

public class UtilsTools extends ItemPickaxe {
	
	public UtilsTools(ToolMaterial material) {
		super(material);
	}
	 public static MovingObjectPosition raytraceFromEntity (World world, Entity player, boolean par3, double range) {
	        float angel = 0.017453292F;
	        float f = 1.0F;
	        float f1 = player.prevRotationPitch + (player.rotationPitch - player.prevRotationPitch) * f;
	        float f2 = player.prevRotationYaw + (player.rotationYaw - player.prevRotationYaw) * f;
	        double d0 = player.prevPosX + (player.posX - player.prevPosX) * (double) f;
	        double d1 = player.prevPosY + (player.posY - player.prevPosY) * (double) f;
	        if (!world.isRemote && player instanceof EntityPlayer) d1 += 1.62D;
	        double d2 = player.prevPosZ + (player.posZ - player.prevPosZ) * (double) f;
	        Vec3 vec3 = Vec3.createVectorHelper(d0, d1, d2);
	        float f3 = MathHelper.cos(-f2 * angel - (float) Math.PI);
	        float f4 = MathHelper.sin(- f2 * angel - (float) Math.PI);
	        float f5 = -MathHelper.cos(-f1 * angel);
	        float f6 = MathHelper.sin(- f1 * angel);
	        float f7 = f4 * f5;
	        float f8 = f3 * f5;
	        double d3 = range;
	        if (player instanceof EntityPlayerMP) d3 = ((EntityPlayerMP) player).theItemInWorldManager.getBlockReachDistance();
	        Vec3 vec31 = vec3.addVector((double) f7 * d3, (double) f6 * d3, (double) f8 * d3);
	        return world.func_147447_a(vec3, vec31, par3, !par3, par3);
	    }


}
