package io.github.autumnaldev.limleg.module.base.util;

import io.github.autumnaldev.limleg.module.eternal_frost.item.ItemRegistryEF;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public enum LimbonicLegacyToolMaterial implements ToolMaterial {
    EF_ARCTITE(2, 302, 6.0F, 3.0F, 22, Ingredient.ofItems(ItemRegistryEF.ARCTITE_INGOT)),
    EF_COLDSTEEL(4, 824, 8.0F, 4.0F, 34, Ingredient.ofItems(ItemRegistryEF.COLDSTEEL_INGOT))
    ;

    private final int level;
    private final int durability;
    private final float speed;
    private final float damage;
    private final int enchantability;
    private final Ingredient repair;

    LimbonicLegacyToolMaterial(int level, int durability, float speed, float damage, int enchantability, Ingredient repair) {
        this.level = level;
        this.durability = durability;
        this.speed = speed;
        this.damage = damage;
        this.enchantability = enchantability;
        this.repair = repair;
    }

    @Override
    public int getDurability() {
        return this.durability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.speed;
    }

    @Override
    public float getAttackDamage() {
        return this.damage;
    }

    @Override
    public int getMiningLevel() {
        return this.level;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repair;
    }
}
