package io.github.autumnaldev.limleg.module.eternal_frost.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FarmlandBlock;

public class FrozenFarmlandBlock extends Block {
    public FrozenFarmlandBlock() {
        super(FabricBlockSettings.copyOf(Blocks.FARMLAND));
    }


}
