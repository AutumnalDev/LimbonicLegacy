package io.github.autumnaldev.limleg.module.eternal_frost;

import io.github.autumnaldev.limleg.LimbonicLegacy;
import io.github.autumnaldev.limleg.module.eternal_frost.item.equipment.ArmourRegistryEF;
import io.github.autumnaldev.limleg.module.eternal_frost.item.ItemRegistryEF;
import io.github.autumnaldev.limleg.module.eternal_frost.item.equipment.ToolRegistryEF;
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
            entries.add(ToolRegistryEF.ARCTITE_SWORD);
            entries.add(ToolRegistryEF.ARCTITE_SHOVEL);
            entries.add(ToolRegistryEF.ARCTITE_PICKAXE);
            entries.add(ToolRegistryEF.ARCTITE_AXE);
            entries.add(ToolRegistryEF.ARCTITE_HOE);
            entries.add(ArmourRegistryEF.ARCTITE_HELMET);
            entries.add(ArmourRegistryEF.ARCTITE_CHESTPLATE);
            entries.add(ArmourRegistryEF.ARCTITE_LEGGINGS);
            entries.add(ArmourRegistryEF.ARCTITE_BOOTS);
            
            entries.add(ItemRegistryEF.COLDSTEEL_INGOT);
            entries.add(ToolRegistryEF.COLDSTEEL_SWORD);
            entries.add(ToolRegistryEF.COLDSTEEL_SHOVEL);
            entries.add(ToolRegistryEF.COLDSTEEL_PICKAXE);
            entries.add(ToolRegistryEF.COLDSTEEL_AXE);
            entries.add(ToolRegistryEF.COLDSTEEL_HOE);
            entries.add(ArmourRegistryEF.COLDSTEEL_HELMET);
            entries.add(ArmourRegistryEF.COLDSTEEL_CHESTPLATE);
            entries.add(ArmourRegistryEF.COLDSTEEL_LEGGINGS);
            entries.add(ArmourRegistryEF.COLDSTEEL_BOOTS);
        })
        .displayName(Text.translatable("itemGroup.limboniclegacy.group_ef"))
        .build();

    public static void run() {
        LimbonicLegacy.LOGGER.info("Loading Eternal Frost module...");

        ItemRegistryEF.INSTANCE.register();
        ToolRegistryEF.INSTANCE.register();
        ArmourRegistryEF.INSTANCE.register();

        Registry.register(Registries.ITEM_GROUP, new Identifier("limboniclegacy", "group_ef"), GROUP);
    }
}
