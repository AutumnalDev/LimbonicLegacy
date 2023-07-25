package io.github.autumnaldev.limleg.module.eternal_frost;

import io.github.autumnaldev.limleg.module.eternal_frost.item.equipment.ArmourRegistryEF;
import io.github.autumnaldev.limleg.module.eternal_frost.item.ItemRegistryEF;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModuleInitEF {
    public static final ItemGroup GROUP = FabricItemGroup.builder()
        .icon(ItemRegistryEF.ARCTITE_INGOT::getDefaultStack)
        .entries((context, entries) -> {
            entries.add(ItemRegistryEF.ARCTITE_INGOT);
            entries.add(ItemRegistryEF.COLDSTEEL_INGOT);
        })
        .displayName(Text.translatable("itemGroup.limboniclegacy.group_ef"))
        .build();

    public static void run() {
        ItemRegistryEF.INSTANCE.register();
        ArmourRegistryEF.INSTANCE.register();

        Registry.register(Registries.ITEM_GROUP, new Identifier("limboniclegacy", "group_ef"), GROUP);
    }
}
