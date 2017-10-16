package ru.denik.item;

import cpw.mods.fml.common.Mod.*;
import net.minecraft.entity.player.*;
import net.minecraft.item.*;
import net.minecraft.potion.*;
import net.minecraft.world.*;
import ru.denik.mod.MainClass;
import ru.denik.mod.TabMod;

public class AppleBlue extends ItemFood{

	public AppleBlue(int par1,int par2, float par3, boolean par4) {
		super(par1, par2, par4);
		maxStackSize = 64;
		setAlwaysEdible();
		setCreativeTab(MainClass.tabMod);
	}
	protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
		 super.onFoodEaten(stack, worldIn, player);
		player.addPotionEffect(new PotionEffect(1, 900, 1));
		player.addPotionEffect(new PotionEffect(10, 300, 1));
		player.addPotionEffect(new PotionEffect(8, 900, 1));
		player.addPotionEffect(new PotionEffect(12, 300, 1));
	}

}
