package io.github.autumnaldev.limleg.module.candycraft;

import io.github.autumnaldev.limleg.LimbonicLegacy;
import io.github.autumnaldev.limleg.module.candycraft.registry.BlockItemRegistryCandy;
import io.github.autumnaldev.limleg.module.candycraft.registry.BlockRegistryCandy;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModuleInitCandy {
    public static final ItemGroup GROUP = FabricItemGroup.builder()
        .icon(BlockItemRegistryCandy.PUDDING::getDefaultStack)
        .entries((context, entries) -> {
            entries.add(BlockItemRegistryCandy.CANDY_CANE);
            entries.add(BlockItemRegistryCandy.PUDDING);
            entries.add(BlockItemRegistryCandy.FLOUR);
            
            entries.add(BlockItemRegistryCandy.MARSHMALLOW_LOG_LIGHT);
            entries.add(BlockItemRegistryCandy.MARSHMALLOW_LOG_NORMAL);
            entries.add(BlockItemRegistryCandy.MARSHMALLOW_LOG_DARK);

            entries.add(BlockItemRegistryCandy.MARSHMALLOW_PLANKS_LIGHT);
            entries.add(BlockItemRegistryCandy.MARSHMALLOW_PLANKS_NORMAL);
            entries.add(BlockItemRegistryCandy.MARSHMALLOW_PLANKS_DARK);
        })
        .displayName(Text.translatable("itemGroup.limboniclegacy.group_candy"))
        .build();

    public static void run() {
        LimbonicLegacy.LOGGER.info("Loading CandyCraft module...");

        BlockRegistryCandy.INSTANCE.register();
        BlockItemRegistryCandy.INSTANCE.register();

        Registry.register(Registries.ITEM_GROUP, new Identifier("limboniclegacy", "group_candy"), GROUP);
    }
}
