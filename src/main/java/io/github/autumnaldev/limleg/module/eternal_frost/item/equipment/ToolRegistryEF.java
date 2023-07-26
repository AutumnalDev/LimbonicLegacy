package io.github.autumnaldev.limleg.module.eternal_frost.item.equipment;

import io.github.autumnaldev.limleg.module.base.util.GenericRegistry;
import io.github.autumnaldev.limleg.module.base.util.LimbonicLegacyToolMaterial;
import net.minecraft.item.AxeItem;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.Item.Settings;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.registry.Registries;
import net.minecraft.util.Rarity;

public class ToolRegistryEF extends GenericRegistry<Item> {
    public static final ToolRegistryEF INSTANCE = new ToolRegistryEF();

    public static final Item ARCTITE_SWORD = INSTANCE.add("arctite_sword", new SwordItem(LimbonicLegacyToolMaterial.EF_ARCTITE, 3, -2.4F, new Settings().rarity(Rarity.UNCOMMON)));
    public static final Item ARCTITE_SHOVEL = INSTANCE.add("arctite_shovel", new ShovelItem(LimbonicLegacyToolMaterial.EF_ARCTITE, 1.5F, -3.0F, new Settings().rarity(Rarity.UNCOMMON)));
    public static final Item ARCTITE_PICKAXE = INSTANCE.add("arctite_pickaxe", new PickaxeItem(LimbonicLegacyToolMaterial.EF_ARCTITE, 1, -2.8F, new Settings().rarity(Rarity.UNCOMMON)));
    public static final Item ARCTITE_AXE = INSTANCE.add("arctite_axe", new AxeItem(LimbonicLegacyToolMaterial.EF_ARCTITE, 6.0F, -3.1F, new Settings().rarity(Rarity.UNCOMMON)));
    public static final Item ARCTITE_HOE = INSTANCE.add("arctite_hoe", new HoeItem(LimbonicLegacyToolMaterial.EF_ARCTITE, -2, -1.0F, new Settings().rarity(Rarity.UNCOMMON)));

    public static final Item COLDSTEEL_SWORD = INSTANCE.add("coldsteel_sword", new SwordItem(LimbonicLegacyToolMaterial.EF_COLDSTEEL, 3, -2.4F, new Settings().fireproof().rarity(Rarity.RARE)));
    public static final Item COLDSTEEL_SHOVEL = INSTANCE.add("coldsteel_shovel", new ShovelItem(LimbonicLegacyToolMaterial.EF_COLDSTEEL, 1.5F, -3.0F, new Settings().fireproof().rarity(Rarity.RARE)));
    public static final Item COLDSTEEL_PICKAXE = INSTANCE.add("coldsteel_pickaxe", new PickaxeItem(LimbonicLegacyToolMaterial.EF_COLDSTEEL, 1, -2.8F, new Settings().fireproof().rarity(Rarity.RARE)));
    public static final Item COLDSTEEL_AXE = INSTANCE.add("coldsteel_axe", new AxeItem(LimbonicLegacyToolMaterial.EF_COLDSTEEL, 5.0F, -3.0F, new Settings().fireproof().rarity(Rarity.RARE)));
    public static final Item COLDSTEEL_HOE = INSTANCE.add("coldsteel_hoe", new HoeItem(LimbonicLegacyToolMaterial.EF_COLDSTEEL, -4, 0.0F, new Settings().fireproof().rarity(Rarity.RARE)));

    protected ToolRegistryEF() {
        super(Registries.ITEM);
    }
}
