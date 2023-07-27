package io.github.autumnaldev.limleg.module.candycraft.registry;

import io.github.autumnaldev.limleg.module.base.util.GenericRegistry;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.MapColor;
import net.minecraft.block.PillarBlock;
import net.minecraft.registry.Registries;

public class BlockRegistryCandy extends GenericRegistry<Block> {
    public static final BlockRegistryCandy INSTANCE = new BlockRegistryCandy();

    public static final Block CANDY_CANE = INSTANCE.add("candy_cane", new PillarBlock(FabricBlockSettings.copyOf(Blocks.PINK_WOOL)));
    public static final Block FLOUR = INSTANCE.add("flour", new Block(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block PUDDING = INSTANCE.add("pudding", new Block(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));

    public static final Block MARSHMALLOW_LOG_LIGHT = INSTANCE.add("marshmallow_log_light", Blocks.createLogBlock(MapColor.PINK, MapColor.PINK));
    public static final Block MARSHMALLOW_LOG_NORMAL = INSTANCE.add("marshmallow_log_normal", Blocks.createLogBlock(MapColor.PINK, MapColor.PINK));
    public static final Block MARSHMALLOW_LOG_DARK = INSTANCE.add("marshmallow_log_dark", Blocks.createLogBlock(MapColor.PINK, MapColor.PINK));

    public static final Block MARSHMALLOW_PLANKS_LIGHT = INSTANCE.add("marshmallow_planks_light", new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block MARSHMALLOW_PLANKS_NORMAL = INSTANCE.add("marshmallow_planks_normal", new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block MARSHMALLOW_PLANKS_DARK = INSTANCE.add("marshmallow_planks_dark", new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

    protected BlockRegistryCandy() {
        super(Registries.BLOCK);
    }
}
