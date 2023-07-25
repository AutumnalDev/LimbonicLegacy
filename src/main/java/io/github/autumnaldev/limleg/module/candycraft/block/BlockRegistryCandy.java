package io.github.autumnaldev.limleg.module.candycraft.block;

import io.github.autumnaldev.limleg.module.base.util.GenericRegistry;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.MapColor;
import net.minecraft.block.PillarBlock;
import net.minecraft.registry.Registries;

public class BlockRegistryCandy extends GenericRegistry<Block> {
    public static final BlockRegistryCandy INSTANCE = new BlockRegistryCandy();

    public static final Block CANDY_CANE = INSTANCE.register("candy_cane", new PillarBlock(FabricBlockSettings.copyOf(Blocks.PINK_WOOL)));
    public static final Block PUDDING = INSTANCE.register("pudding", new Block(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block MARSHMALLOW_LOG_NORMAL = INSTANCE.register("marshmallow_log_normal", Blocks.createLogBlock(MapColor.PINK, MapColor.PINK));
    public static final Block MARSHMALLOW_LOG_DARK = INSTANCE.register("marshmallow_log_dark", Blocks.createLogBlock(MapColor.PINK, MapColor.PINK));
    public static final Block MARSHMALLOW_LOG_LIGHT = INSTANCE.register("marshmallow_log_light", Blocks.createLogBlock(MapColor.PINK, MapColor.PINK));
    public static final Block FLOUR = INSTANCE.register("flour", new Block(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));

    protected BlockRegistryCandy() {
        super(Registries.BLOCK);
    }
}
