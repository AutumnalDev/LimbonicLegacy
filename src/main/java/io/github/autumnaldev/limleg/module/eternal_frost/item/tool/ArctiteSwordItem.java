package io.github.autumnaldev.limleg.module.eternal_frost.item.tool;

import io.github.autumnaldev.limleg.module.base.util.LimbonicLegacyToolMaterial;
import io.github.autumnaldev.limleg.module.eternal_frost.util.EntityLootFreezer;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

import java.util.HashMap;

public class ArctiteSwordItem extends SwordItem implements EntityLootFreezer {
    public ArctiteSwordItem() {
        super(LimbonicLegacyToolMaterial.EF_ARCTITE, 3, -2.4F, new Settings().rarity(Rarity.UNCOMMON));
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        boolean result = super.postHit(stack, target, attacker);

        if (result) {
            target.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 100));

            if (target.hurtByWater()) {
                target.damage(target.getDamageSources().freeze(), 4.0F);
            }

            return true;
        }

        return false;
    }

    @Override
    public HashMap<EntityType<? extends LivingEntity>, Identifier> freezables() {
        HashMap<EntityType<? extends LivingEntity>, Identifier> map = new HashMap<>();

        // TODO: actually make these loot tables lmao
//        map.put(EntityType.PIG, new Identifier("limboniclegacy", "frozen_pig"));
//        map.put(EntityType.BLAZE, new Identifier("limboniclegacy", "frozen_blaze"));
//        map.put(EntityType.WITCH, new Identifier("limboniclegacy", "frozen_witch"));
//        map.put(EntityType.ZOMBIE, new Identifier("limboniclegacy", "frozen_zombie"));
//        map.put(EntityType.SPIDER, new Identifier("limboniclegacy", "frozen_spider"));
//        map.put(EntityType.CREEPER, new Identifier("limboniclegacy", "frozen_creeper"));
//        map.put(EntityType.CAVE_SPIDER, new Identifier("limboniclegacy", "frozen_spider"));

        return map;
    }
}
