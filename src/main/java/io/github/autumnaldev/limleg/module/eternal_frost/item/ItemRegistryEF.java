package io.github.autumnaldev.limleg.module.eternal_frost.item;

import io.github.autumnaldev.limleg.module.base.util.GenericRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.Item.Settings;
import net.minecraft.registry.Registries;
import net.minecraft.util.Rarity;

public class ItemRegistryEF extends GenericRegistry<Item> {
    public static final ItemRegistryEF INSTANCE = new ItemRegistryEF();

    public static final Item ARCTITE_INGOT = INSTANCE.add("arctite_ingot", new Item(new Settings().rarity(Rarity.UNCOMMON)));
    public static final Item COLDSTEEL_INGOT = INSTANCE.add("coldsteel_ingot", new Item(new Settings().fireproof().rarity(Rarity.RARE)));

    protected ItemRegistryEF() {
        super(Registries.ITEM);
    }
}