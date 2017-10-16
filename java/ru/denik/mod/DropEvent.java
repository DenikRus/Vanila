package ru.denik.mod;

import java.util.Random;

import cpw.mods.fml.common.Mod.*;
import cpw.mods.fml.common.eventhandler.*;
import net.minecraft.entity.item.*;
import net.minecraft.entity.passive.*;
import net.minecraft.item.*;
import net.minecraftforge.event.entity.living.*;
import ru.denik.mod.register.*;

public class DropEvent {
	
	public static RegisterItems registerItems;
	
	@SubscribeEvent
	public void onDrop(LivingDropsEvent e) {
	if (e.entity instanceof EntitySheep) {
    ItemStack item1 = new ItemStack(registerItems.foodMutton, 2);
	e.drops.add(new EntityItem(e.entity.worldObj, e.entity.posX, e.entity.posY, e.entity.posZ, item1));
	}
	}
	
}


