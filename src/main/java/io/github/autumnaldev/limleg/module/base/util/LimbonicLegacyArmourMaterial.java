package io.github.autumnaldev.limleg.module.base.util;

import io.github.autumnaldev.limleg.module.eternal_frost.registry.ItemRegistryEF;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Util;

import java.util.EnumMap;

public enum LimbonicLegacyArmourMaterial implements ArmorMaterial {
    EF_ARCTITE("arctite", 11, new int[]{2, 6, 5, 2}, 1, Ingredient.ofItems(ItemRegistryEF.ARCTITE_INGOT), 1.75f, 0f),
    EF_COLDSTEEL("coldsteel", 22, new int[]{3, 9, 7, 3}, 26, Ingredient.ofItems(ItemRegistryEF.COLDSTEEL_INGOT), 3.5f, 0.25f)

    ;

    private static final EnumMap<ArmorItem.Type, Integer> BASE_DURABILITY = Util.make(new EnumMap<>(ArmorItem.Type.class), (map) -> {
        map.put(ArmorItem.Type.BOOTS, 13);
        map.put(ArmorItem.Type.LEGGINGS, 15);
        map.put(ArmorItem.Type.CHESTPLATE, 16);
        map.put(ArmorItem.Type.HELMET, 11);
    });

    LimbonicLegacyArmourMaterial(String name, int durability, int[] protection, int enchantability, Ingredient repair, float toughness, float knockback) {
        this.name = name;
        this.durability = durability;
        this.protection = protection;
        this.enchantability = enchantability;
        this.repair = repair;
        this.toughness = toughness;
        this.knockback = knockback;
    }

    private final String name;
    private final int durability;
    private final int[] protection;
    private final int enchantability;
    private final Ingredient repair;
    private final float toughness;
    private final float knockback;

    @Override
    public int getDurability(ArmorItem.Type type) {
        return BASE_DURABILITY.get(type) * this.durability;
    }

    @Override
    public int getProtection(ArmorItem.Type type) {
        return this.protection[type.ordinal()];
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.ITEM_ARMOR_EQUIP_GENERIC;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repair;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockback;
    }
}
