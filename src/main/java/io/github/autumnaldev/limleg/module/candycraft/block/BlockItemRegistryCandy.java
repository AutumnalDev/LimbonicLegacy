package io.github.autumnaldev.limleg.module.candycraft.block;

import io.github.autumnaldev.limleg.module.base.util.GenericRegistry;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;

public class BlockItemRegistryCandy extends GenericRegistry<Item> {
    public static final BlockItemRegistryCandy INSTANCE = new BlockItemRegistryCandy();

    public static final Item CANDY_CANE = INSTANCE.register("candy_cane", new BlockItem(BlockRegistryCandy.CANDY_CANE, new Item.Settings()));
    public static final Item PUDDING = INSTANCE.register("pudding", new BlockItem(BlockRegistryCandy.PUDDING, new Item.Settings()));
    public static final Item MARSHMALLOW_LOG_NORMAL = INSTANCE.register("marshmallow_log_normal", new BlockItem(BlockRegistryCandy.MARSHMALLOW_LOG_NORMAL, new Item.Settings()));
    public static final Item MARSHMALLOW_LOG_DARK = INSTANCE.register("marshmallow_log_dark", new BlockItem(BlockRegistryCandy.MARSHMALLOW_LOG_DARK, new Item.Settings()));
    public static final Item MARSHMALLOW_LOG_LIGHT = INSTANCE.register("marshmallow_log_light", new BlockItem(BlockRegistryCandy.MARSHMALLOW_LOG_LIGHT, new Item.Settings()));
    public static final Item FLOUR = INSTANCE.register("flour", new BlockItem(BlockRegistryCandy.FLOUR, new Item.Settings()));

    protected BlockItemRegistryCandy() {
        super(Registries.ITEM);
    }
}
