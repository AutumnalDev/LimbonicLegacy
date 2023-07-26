package io.github.autumnaldev.limleg.module.candycraft.block;

import io.github.autumnaldev.limleg.module.base.util.GenericRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item.Settings;
import net.minecraft.registry.Registries;

public class BlockItemRegistryCandy extends GenericRegistry<Item> {
    public static final BlockItemRegistryCandy INSTANCE = new BlockItemRegistryCandy();

    public static final Item CANDY_CANE = INSTANCE.add("candy_cane", new BlockItem(BlockRegistryCandy.CANDY_CANE, new Settings()));
    public static final Item PUDDING = INSTANCE.add("pudding", new BlockItem(BlockRegistryCandy.PUDDING, new Settings()));
    public static final Item FLOUR = INSTANCE.add("flour", new BlockItem(BlockRegistryCandy.FLOUR, new Settings()));

    public static final Item MARSHMALLOW_LOG_LIGHT = INSTANCE.add("marshmallow_log_light", new BlockItem(BlockRegistryCandy.MARSHMALLOW_LOG_LIGHT, new Settings()));
    public static final Item MARSHMALLOW_LOG_NORMAL = INSTANCE.add("marshmallow_log_normal", new BlockItem(BlockRegistryCandy.MARSHMALLOW_LOG_NORMAL, new Settings()));
    public static final Item MARSHMALLOW_LOG_DARK = INSTANCE.add("marshmallow_log_dark", new BlockItem(BlockRegistryCandy.MARSHMALLOW_LOG_DARK, new Settings()));

    public static final Item MARSHMALLOW_PLANKS_LIGHT = INSTANCE.add("marshmallow_planks_light", new BlockItem(BlockRegistryCandy.MARSHMALLOW_PLANKS_LIGHT, new Settings()));
    public static final Item MARSHMALLOW_PLANKS_NORMAL = INSTANCE.add("marshmallow_planks_normal", new BlockItem(BlockRegistryCandy.MARSHMALLOW_PLANKS_NORMAL, new Settings()));
    public static final Item MARSHMALLOW_PLANKS_DARK = INSTANCE.add("marshmallow_planks_dark", new BlockItem(BlockRegistryCandy.MARSHMALLOW_PLANKS_DARK, new Settings()));

    protected BlockItemRegistryCandy() {
        super(Registries.ITEM);
    }
}
