package com.magnus.letsmodreboot.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;

/**
 * Created by Magnus on 05.07.2014.
 */
public class ItemMapleLeaf extends ItemLMRB
{
    public ItemMapleLeaf()
    {
        super();
        this.toolMaterial.getHarvestLevel() >= 2;
        this.setMaxStackSize(3);
        this.setUnlocalizedName("mapleLeaf");
    }
}
