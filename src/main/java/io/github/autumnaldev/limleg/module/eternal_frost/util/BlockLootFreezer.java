package io.github.autumnaldev.limleg.module.eternal_frost.util;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Pair;
import org.jetbrains.annotations.Nullable;

import java.util.HashMap;

public interface BlockLootFreezer {
    HashMap<Block, Pair<ItemStack, ItemStack>> freezableBlocks();

    @Nullable
    HashMap<TagKey<Block>, Pair<ItemStack, ItemStack>> freezableTags();
}