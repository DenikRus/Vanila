package ru.denik.item.armor;

import net.minecraft.entity.Entity;
import net.minecraft.item.*;
import net.minecraftforge.common.util.*;
import ru.denik.mod.MainClass;

public class EmeraldArmor extends ItemArmor {
	
	 private String texturePath = "vanila:textures/model/armor/";
	
	public static ArmorMaterial mat = EnumHelper.addArmorMaterial("emerald", 34, new int[] {4, 8, 5, 3}, 30);

	public EmeraldArmor(int id, int armorType) {
		super(mat, armorType, armorType);
		setCreativeTab(MainClass.tabMod);
		setMaxStackSize(1);
		setTextureName();
	}
	public void setTextureName() {
		if (armorType == 0||armorType == 1||armorType == 3) {
			this.texturePath += "emerald_layer_" + 1 + ".png";
		}
		else {
			this.texturePath += "emerald_layer_" + 2 + ".png";
		}
	}
	@Override
    public String getArmorTexture(ItemStack itemstack, Entity entity, int slot, String type){
            return this.texturePath;
    }

}
