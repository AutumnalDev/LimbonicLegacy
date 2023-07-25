package io.github.autumnaldev.limleg.module.eternal_frost.item.equipment;

import io.github.autumnaldev.limleg.module.base.util.LimbonicLegacyArmourMaterial;
import io.github.autumnaldev.limleg.module.base.util.GenericRegistry;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.util.Rarity;

@SuppressWarnings("unused")
public class ArmourRegistryEF extends GenericRegistry<Item> {
    public static final ArmourRegistryEF INSTANCE = new ArmourRegistryEF();

    public static final Item ARCTITE_HELMET = INSTANCE.register("arctite_helmet",
            new ArmorItem(LimbonicLegacyArmourMaterial.EF_ARCTITE, ArmorItem.Type.HELMET, new Item.Settings().rarity(Rarity.UNCOMMON)));
    public static final Item ARCTITE_CHESTPLATE = INSTANCE.register("arctite_chestplate",
            new ArmorItem(LimbonicLegacyArmourMaterial.EF_ARCTITE, ArmorItem.Type.CHESTPLATE, new Item.Settings().rarity(Rarity.UNCOMMON)));
    public static final Item ARCTITE_LEGGINGS = INSTANCE.register("arctite_leggings",
            new ArmorItem(LimbonicLegacyArmourMaterial.EF_ARCTITE, ArmorItem.Type.LEGGINGS, new Item.Settings().rarity(Rarity.UNCOMMON)));
    public static final Item ARCTITE_BOOTS = INSTANCE.register("arctite_boots",
            new ArmorItem(LimbonicLegacyArmourMaterial.EF_ARCTITE, ArmorItem.Type.BOOTS, new Item.Settings().rarity(Rarity.UNCOMMON)));

    public static final Item COLDSTEEL_HELMET = INSTANCE.register("coldsteel_helmet",
            new ArmorItem(LimbonicLegacyArmourMaterial.EF_COLDSTEEL, ArmorItem.Type.HELMET, new Item.Settings().rarity(Rarity.RARE)));
    public static final Item COLDSTEEL_CHESTPLATE = INSTANCE.register("coldsteel_chestplate",
            new ArmorItem(LimbonicLegacyArmourMaterial.EF_COLDSTEEL, ArmorItem.Type.CHESTPLATE, new Item.Settings().rarity(Rarity.RARE)));
    public static final Item COLDSTEEL_LEGGINGS = INSTANCE.register("coldsteel_leggings",
            new ArmorItem(LimbonicLegacyArmourMaterial.EF_COLDSTEEL, ArmorItem.Type.LEGGINGS, new Item.Settings().rarity(Rarity.RARE)));
    public static final Item COLDSTEEL_BOOTS = INSTANCE.register("coldsteel_boots",
            new ArmorItem(LimbonicLegacyArmourMaterial.EF_COLDSTEEL, ArmorItem.Type.BOOTS, new Item.Settings().rarity(Rarity.RARE)));

    protected ArmourRegistryEF() {
        super(Registries.ITEM);
    }
}
