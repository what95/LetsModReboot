package com.magnus.letsmodreboot.init;

import com.magnus.letsmodreboot.block.BlockLMR;
import com.magnus.letsmodreboot.block.BlockOre;
import com.magnus.letsmodreboot.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Magnus on 08.07.2014.
 */
@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final BlockLMR ore = new BlockOre();

    public static void init()
    {
        GameRegistry.registerBlock(ore, "ore");
    }
}
