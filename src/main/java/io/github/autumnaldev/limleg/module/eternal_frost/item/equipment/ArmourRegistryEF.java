package io.github.autumnaldev.limleg.module.eternal_frost.item.equipment;

import io.github.autumnaldev.limleg.module.base.util.LimbonicLegacyArmourMaterial;
import io.github.autumnaldev.limleg.module.base.util.GenericRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item.Settings;
import net.minecraft.registry.Registries;
import net.minecraft.util.Rarity;

@SuppressWarnings("unused")
public class ArmourRegistryEF extends GenericRegistry<Item> {
    public static final ArmourRegistryEF INSTANCE = new ArmourRegistryEF();

    public static final Item ARCTITE_HELMET = INSTANCE.add("arctite_helmet",
            new ArmorItem(LimbonicLegacyArmourMaterial.EF_ARCTITE, ArmorItem.Type.HELMET, new Settings().rarity(Rarity.UNCOMMON)));
    public static final Item ARCTITE_CHESTPLATE = INSTANCE.add("arctite_chestplate",
            new ArmorItem(LimbonicLegacyArmourMaterial.EF_ARCTITE, ArmorItem.Type.CHESTPLATE, new Settings().rarity(Rarity.UNCOMMON)));
    public static final Item ARCTITE_LEGGINGS = INSTANCE.add("arctite_leggings",
            new ArmorItem(LimbonicLegacyArmourMaterial.EF_ARCTITE, ArmorItem.Type.LEGGINGS, new Settings().rarity(Rarity.UNCOMMON)));
    public static final Item ARCTITE_BOOTS = INSTANCE.add("arctite_boots",
            new ArmorItem(LimbonicLegacyArmourMaterial.EF_ARCTITE, ArmorItem.Type.BOOTS, new Settings().rarity(Rarity.UNCOMMON)));

    public static final Item COLDSTEEL_HELMET = INSTANCE.add("coldsteel_helmet",
            new ArmorItem(LimbonicLegacyArmourMaterial.EF_COLDSTEEL, ArmorItem.Type.HELMET, new Settings().rarity(Rarity.RARE).fireproof()));
    public static final Item COLDSTEEL_CHESTPLATE = INSTANCE.add("coldsteel_chestplate",
            new ArmorItem(LimbonicLegacyArmourMaterial.EF_COLDSTEEL, ArmorItem.Type.CHESTPLATE, new Settings().rarity(Rarity.RARE).fireproof()));
    public static final Item COLDSTEEL_LEGGINGS = INSTANCE.add("coldsteel_leggings",
            new ArmorItem(LimbonicLegacyArmourMaterial.EF_COLDSTEEL, ArmorItem.Type.LEGGINGS, new Settings().rarity(Rarity.RARE).fireproof()));
    public static final Item COLDSTEEL_BOOTS = INSTANCE.add("coldsteel_boots",
            new ArmorItem(LimbonicLegacyArmourMaterial.EF_COLDSTEEL, ArmorItem.Type.BOOTS, new Settings().rarity(Rarity.RARE).fireproof()));

    protected ArmourRegistryEF() {
        super(Registries.ITEM);
    }
}
