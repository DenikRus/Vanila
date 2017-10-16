package ru.denik.item.armor;

import net.minecraft.entity.*;
import net.minecraft.item.*;
import net.minecraftforge.common.util.*;
import ru.denik.mod.*;

public class GroundArmor extends ItemArmor{
	
	 private String texturePath = "vanila:textures/model/armor/";
	
	static ArmorMaterial mat = EnumHelper.addArmorMaterial("ground", 5, new int[] {1, 2, 2, 1}, 1000);

	public GroundArmor(int id, int armorType) {
		super(mat, armorType, armorType);
		setCreativeTab(MainClass.tabMod);
		setMaxStackSize(1);
		this.setTextureName();
	}
	public void setTextureName() {
		if (armorType == 0||armorType == 1||armorType == 3) {
			this.texturePath += "ground_layer_" + 1 + ".png";
		}
		else {
			this.texturePath += "ground_layer_" + 2 + ".png";
		}
	}
	@Override
    public String getArmorTexture(ItemStack itemstack, Entity entity, int slot, String type){
            return this.texturePath;
    }
}
