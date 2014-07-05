package com.magnus.letsmodreboot.init;

import com.magnus.letsmodreboot.item.ItemLMRB;
import com.magnus.letsmodreboot.item.ItemMapleLeaf;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Magnus on 05.07.2014.
 */
public class ModItems
{
    public static final ItemLMRB mapleLeaf = new ItemMapleLeaf();

    public static void init()
    {
        GameRegistry.registerItem(mapleLeaf, "mapleLeaf");
    }
}
