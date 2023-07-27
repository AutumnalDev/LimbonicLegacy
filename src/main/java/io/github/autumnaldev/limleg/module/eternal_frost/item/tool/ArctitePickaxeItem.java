package io.github.autumnaldev.limleg.module.eternal_frost.item.tool;

import io.github.autumnaldev.limleg.module.base.util.LimbonicLegacyToolMaterial;
import io.github.autumnaldev.limleg.module.eternal_frost.registry.BlockItemRegistryEF;
import io.github.autumnaldev.limleg.module.eternal_frost.util.BlockLootFreezer;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.item.PickaxeItem;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Pair;
import net.minecraft.util.Rarity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.HashMap;

public class ArctitePickaxeItem extends PickaxeItem implements BlockLootFreezer {
    public ArctitePickaxeItem() {
        super(LimbonicLegacyToolMaterial.EF_ARCTITE, 1, -2.8F, new Settings().rarity(Rarity.UNCOMMON));
    }

    @Override
    public float getMiningSpeedMultiplier(ItemStack stack, BlockState state) {
        return super.getMiningSpeedMultiplier(stack, state) * (state.isIn(BlockTags.ICE) ? 2 : 1);
    }

    @Override
    @SuppressWarnings("DataFlowIssue")
    public ActionResult useOnBlock(ItemUsageContext context) {
        BlockPos pos = context.getBlockPos();
        World world = context.getWorld();
        if (world.getBlockState(pos).equals(Blocks.ICE.getDefaultState())) {
            world.setBlockState(pos, Blocks.PACKED_ICE.getDefaultState(), Block.NOTIFY_ALL);
            ItemStack stack = context.getPlayer().getStackInHand(context.getHand());
            stack.damage(9, context.getPlayer(), player -> player.sendEquipmentBreakStatus(EquipmentSlot.MAINHAND));
            return ActionResult.SUCCESS;
        }
        return ActionResult.PASS;
    }

    @Override
    public HashMap<Block, Pair<ItemStack, ItemStack>> freezableBlocks() {
        HashMap<Block, Pair<ItemStack, ItemStack>> map = new HashMap<>();

        map.put(Blocks.COBBLESTONE, new Pair<>(BlockItemRegistryEF.FROZEN_COBBLESTONE.getDefaultStack(), BlockItemRegistryEF.FROZEN_COBBLESTONE.getDefaultStack()));

        return map;
    }

    @Override
    public @Nullable HashMap<TagKey<Block>, Pair<ItemStack, ItemStack>> freezableTags() {
        HashMap<TagKey<Block>, Pair<ItemStack, ItemStack>> map = new HashMap<>();

        map.put(BlockTags.BASE_STONE_OVERWORLD, new Pair<>(BlockItemRegistryEF.FROZEN_STONE.getDefaultStack(), BlockItemRegistryEF.FROZEN_COBBLESTONE.getDefaultStack()));
        map.put(BlockTags.IRON_ORES, new Pair<>(BlockItemRegistryEF.ARCTITE_ORE.getDefaultStack(), BlockItemRegistryEF.ARCTITE_ORE.getDefaultStack()));

        return map;
    }
}