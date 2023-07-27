package io.github.autumnaldev.limleg.module.eternal_frost.registry;

import io.github.autumnaldev.limleg.module.base.util.GenericRegistry;
import io.github.autumnaldev.limleg.module.eternal_frost.block.FrozenFarmlandBlock;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.PillarBlock;
import net.minecraft.registry.Registries;

public class BlockRegistryEF extends GenericRegistry<Block> {
    public static final BlockRegistryEF INSTANCE = new BlockRegistryEF();

    public static final Block FROZEN_COBBLESTONE = INSTANCE.add("frozen_cobblestone", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
    public static final Block FROZEN_STONE = INSTANCE.add("frozen_stone", new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block FROZEN_SAND = INSTANCE.add("frozen_sand", new Block(FabricBlockSettings.copyOf(Blocks.SAND)));
    public static final Block FROZEN_DIRT = INSTANCE.add("frozen_dirt", new Block(FabricBlockSettings.copyOf(Blocks.DIRT)));
    public static final Block FROZEN_GRASS = INSTANCE.add("frozen_grass", new Block(FabricBlockSettings.copyOf(Blocks.GRASS_BLOCK)));
    public static final Block SNOWBARK_LOG = INSTANCE.add("snowbark_log", new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block SNOWBARK_PLANKS = INSTANCE.add("snowbark_planks", new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block FROZEN_FARMLAND = INSTANCE.add("frozen_farmland", new FrozenFarmlandBlock());

    public static final Block ARCTITE_ORE = INSTANCE.add("arctite_ore", new Block(FabricBlockSettings.copyOf(Blocks.IRON_ORE)));

    protected BlockRegistryEF() {
        super(Registries.BLOCK);
    }
}