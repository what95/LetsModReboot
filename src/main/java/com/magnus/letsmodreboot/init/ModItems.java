package com.magnus.letsmodreboot.init;

import com.magnus.letsmodreboot.item.ItemLMRB;
import com.magnus.letsmodreboot.item.ItemMapleLeaf;
import com.magnus.letsmodreboot.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Magnus on 05.07.2014.
 */
@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemLMRB mapleLeaf = new ItemMapleLeaf();

    public static void init()
    {
        GameRegistry.registerItem(mapleLeaf, "mapleLeaf");
    }
}
