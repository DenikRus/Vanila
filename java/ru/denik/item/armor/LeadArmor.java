package ru.denik.item.armor;

import net.minecraft.entity.*;
import net.minecraft.item.*;
import net.minecraftforge.common.util.*;
import ru.denik.mod.*;

public class LeadArmor extends ItemArmor{
	
	  private String texturePath = "vanila:textures/model/armor/";
	  
	  static ArmorMaterial mat = EnumHelper.addArmorMaterial("lead", 20, new int[] {3, 6, 4, 3}, 18);

	public LeadArmor(int id, int armorType) {
		super(mat, armorType, armorType);
		setCreativeTab(MainClass.tabMod);
		setMaxStackSize(1);
		this.setTextureName();
	}
	public void setTextureName() {
		if (armorType == 0||armorType == 1||armorType == 3) {
			this.texturePath += "lead_layer_" + 1 + ".png";
		}
		else {
			this.texturePath += "lead_layer_" + 2 + ".png";
		}
	}
	@Override
    public String getArmorTexture(ItemStack itemstack, Entity entity, int slot, String type){
            return this.texturePath;
    }

}
