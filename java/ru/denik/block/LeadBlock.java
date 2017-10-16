package ru.denik.block;

import net.minecraft.block.*;
import net.minecraft.block.material.*;
import ru.denik.mod.*;

public class LeadBlock extends Block
{
    public LeadBlock() {
        super(Material.rock);
        this.setCreativeTab(MainClass.tabMod);
        this.setHardness(6.0f);
        this.setHarvestLevel("pickaxe", 2);
        this.setResistance(0.2f);
        this.setBlockName("leadblock");
    }
}
