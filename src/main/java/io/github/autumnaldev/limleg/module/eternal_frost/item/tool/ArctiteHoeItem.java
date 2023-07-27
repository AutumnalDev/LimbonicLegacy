package io.github.autumnaldev.limleg.module.eternal_frost.item.tool;

import com.mojang.datafixers.util.Pair;
import io.github.autumnaldev.limleg.module.base.util.LimbonicLegacyToolMaterial;
import io.github.autumnaldev.limleg.module.eternal_frost.registry.BlockRegistryEF;
import net.minecraft.item.HoeItem;
import net.minecraft.util.Rarity;

public class ArctiteHoeItem extends HoeItem {
    public ArctiteHoeItem() {
        super(LimbonicLegacyToolMaterial.EF_ARCTITE, -2, -1.0F, new Settings().rarity(Rarity.UNCOMMON));
        TILLING_ACTIONS.put(BlockRegistryEF.FROZEN_DIRT, new Pair<>(HoeItem::canTillFarmland, createTillAction(BlockRegistryEF.FROZEN_FARMLAND.getDefaultState())));
        TILLING_ACTIONS.put(BlockRegistryEF.FROZEN_GRASS, new Pair<>(HoeItem::canTillFarmland, createTillAction(BlockRegistryEF.FROZEN_FARMLAND.getDefaultState())));
    }
}
