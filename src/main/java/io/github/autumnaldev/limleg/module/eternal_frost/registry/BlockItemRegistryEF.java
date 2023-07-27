package io.github.autumnaldev.limleg.module.eternal_frost.registry;

import io.github.autumnaldev.limleg.module.base.util.GenericRegistry;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.util.Rarity;

public class BlockItemRegistryEF extends GenericRegistry<Item> {
    public static final BlockItemRegistryEF INSTANCE = new BlockItemRegistryEF();

    public static final Item FROZEN_COBBLESTONE = INSTANCE.add("frozen_cobblestone", new BlockItem(BlockRegistryEF.FROZEN_COBBLESTONE, new Item.Settings()));
    public static final Item FROZEN_STONE = INSTANCE.add("frozen_stone", new BlockItem(BlockRegistryEF.FROZEN_STONE, new Item.Settings()));
    public static final Item FROZEN_SAND = INSTANCE.add("frozen_sand", new BlockItem(BlockRegistryEF.FROZEN_SAND, new Item.Settings()));
    public static final Item FROZEN_DIRT = INSTANCE.add("frozen_dirt", new BlockItem(BlockRegistryEF.FROZEN_DIRT, new Item.Settings()));
    public static final Item FROZEN_GRASS = INSTANCE.add("frozen_grass", new BlockItem(BlockRegistryEF.FROZEN_GRASS, new Item.Settings()));
    public static final Item SNOWBARK_LOG = INSTANCE.add("snowbark_log", new BlockItem(BlockRegistryEF.SNOWBARK_LOG, new Item.Settings()));
    public static final Item SNOWBARK_PLANKS = INSTANCE.add("snowbark_planks", new BlockItem(BlockRegistryEF.SNOWBARK_PLANKS, new Item.Settings()));


    public static final Item ARCTITE_ORE = INSTANCE.add("arctite_ore", new BlockItem(BlockRegistryEF.ARCTITE_ORE, new Item.Settings().rarity(Rarity.UNCOMMON)));

    protected BlockItemRegistryEF() {
        super(Registries.ITEM);
    }
}