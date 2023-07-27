package io.github.autumnaldev.limleg.module.eternal_frost.item.tool;

import io.github.autumnaldev.limleg.module.base.util.LimbonicLegacyToolMaterial;
import io.github.autumnaldev.limleg.module.eternal_frost.registry.BlockItemRegistryEF;
import io.github.autumnaldev.limleg.module.eternal_frost.util.BlockLootFreezer;
import net.minecraft.block.Block;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Pair;
import net.minecraft.util.Rarity;
import org.jetbrains.annotations.Nullable;

import java.util.HashMap;

public class ArctiteAxeItem extends AxeItem implements BlockLootFreezer {
    public ArctiteAxeItem() {
        super(LimbonicLegacyToolMaterial.EF_ARCTITE, 6.0F, -3.1F, new Settings().rarity(Rarity.UNCOMMON));
    }

    @Override
    public HashMap<Block, Pair<ItemStack, ItemStack>> freezableBlocks() {
        return new HashMap<>();
    }

    @Override
    public @Nullable HashMap<TagKey<Block>, Pair<ItemStack, ItemStack>> freezableTags() {
        HashMap<TagKey<Block>, Pair<ItemStack, ItemStack>> map = new HashMap<>();

        map.put(BlockTags.LOGS, new Pair<>(BlockItemRegistryEF.SNOWBARK_LOG.getDefaultStack(), BlockItemRegistryEF.SNOWBARK_LOG.getDefaultStack()));
        map.put(BlockTags.PLANKS, new Pair<>(BlockItemRegistryEF.SNOWBARK_PLANKS.getDefaultStack(), BlockItemRegistryEF.SNOWBARK_PLANKS.getDefaultStack()));

        return map;
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        boolean result = super.postHit(stack, target, attacker);

        if (result) {
            target.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 60));

            if (target.hurtByWater()) {
                target.damage(target.getDamageSources().freeze(), 7.5F);
            }

            return true;
        }

        return false;
    }
}
