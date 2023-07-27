package io.github.autumnaldev.limleg.module.eternal_frost.item.tool;

import io.github.autumnaldev.limleg.module.base.util.LimbonicLegacyToolMaterial;
import io.github.autumnaldev.limleg.module.eternal_frost.registry.BlockItemRegistryEF;
import io.github.autumnaldev.limleg.module.eternal_frost.util.BlockLootFreezer;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.SnowBlock;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.item.Items;
import net.minecraft.item.ShovelItem;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Pair;
import net.minecraft.util.Rarity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.HashMap;

public class ArctiteShovelItem extends ShovelItem implements BlockLootFreezer {
    public ArctiteShovelItem() {
        super(LimbonicLegacyToolMaterial.EF_ARCTITE, 1.5F, -3.0F, new Settings().rarity(Rarity.UNCOMMON));
    }

    @Override
    public float getMiningSpeedMultiplier(ItemStack stack, BlockState state) {
        return super.getMiningSpeedMultiplier(stack, state) * (state.isIn(BlockTags.SNOW) ? 2 : 1);
    }

    @Override
    @SuppressWarnings("DataFlowIssue")
    public ActionResult useOnBlock(ItemUsageContext context) {
        ActionResult result = super.useOnBlock(context);
        BlockPos pos = context.getBlockPos();
        World world = context.getWorld();
        PlayerEntity player = context.getPlayer();
        ItemStack stack = player.getStackInHand(context.getHand());
        PlayerInventory inventory = player.getInventory();
        BlockState state = world.getBlockState(pos);

        if (state.isOf(Blocks.SNOW)) {
            int layers = state.get(SnowBlock.LAYERS);

            if (player.isSneaking()) {
                if (layers > 1) {
                    world.setBlockState(pos, state.with(SnowBlock.LAYERS, layers - 1), Block.NOTIFY_ALL);
                    stack.damage(1, player, entity -> entity.sendEquipmentBreakStatus(EquipmentSlot.MAINHAND));
                    if (inventory.count(Items.SNOWBALL) == 0) {
                        inventory.insertStack(Items.SNOWBALL.getDefaultStack());
                    } else {
                        int searched = 0;

                        for (int slot = 0; slot < inventory.main.size(); slot++) {
                            ItemStack there = inventory.main.get(slot);
                            if (there.getItem() == Items.SNOWBALL && there.getCount() < there.getMaxCount()) {
                                there.increment(1);
                                inventory.main.set(slot, there);
                                break;
                            }

                            searched++;
                        }

                        if (searched >= inventory.main.size()) {
                            ItemEntity entity = new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), Items.SNOWBALL.getDefaultStack());
                            world.spawnEntity(entity);
                        }
                    }
                }

                return ActionResult.SUCCESS;
            }


            if (inventory.count(Items.SNOWBALL) >= 1) {
                stack.damage(3, player, entity -> entity.sendEquipmentBreakStatus(EquipmentSlot.MAINHAND));
                if (layers < 8) {
                    for (int slot = 0; slot < inventory.main.size(); slot++) {
                        ItemStack there = inventory.main.get(slot);
                        if (there.getItem() == Items.SNOWBALL) {
                            if (there.getCount() == 1) {
                                inventory.main.remove(slot);
                                break;
                            }

                            there.decrement(1);
                            break;
                        }
                    }

                    world.setBlockState(pos, state.with(SnowBlock.LAYERS, layers + 1), Block.NOTIFY_ALL);
                    return ActionResult.SUCCESS;
                }

                world.setBlockState(pos, Blocks.SNOW_BLOCK.getDefaultState(), Block.NOTIFY_ALL);
                stack.damage(3, player, entity -> entity.sendEquipmentBreakStatus(EquipmentSlot.MAINHAND));
                return ActionResult.SUCCESS;
            }
        }

        if (state.equals(Blocks.SNOW_BLOCK.getDefaultState()) && player.isSneaking()) {
            world.setBlockState(pos, Blocks.SNOW.getDefaultState().with(SnowBlock.LAYERS, 8), Block.NOTIFY_ALL);
            stack.damage(1, player, entity -> entity.sendEquipmentBreakStatus(EquipmentSlot.MAINHAND));
            if (inventory.count(Items.SNOWBALL) == 0) {
                inventory.insertStack(Items.SNOWBALL.getDefaultStack());
            } else {
                int searched = 0;

                for (int slot = 0; slot < inventory.main.size(); slot++) {
                    ItemStack there = inventory.main.get(slot);
                    if (there.getItem() == Items.SNOWBALL && there.getCount() < there.getMaxCount()) {
                        there.increment(1);
                        inventory.main.set(slot, there);
                        break;
                    }

                    searched++;
                }

                if (searched >= inventory.main.size()) {
                    ItemEntity entity = new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), Items.SNOWBALL.getDefaultStack());
                    world.spawnEntity(entity);
                }
            }
            return ActionResult.SUCCESS;
        }

        return result;
    }

    @Override
    public HashMap<Block, Pair<ItemStack, ItemStack>> freezableBlocks() {
        HashMap<Block, Pair<ItemStack, ItemStack>> map = new HashMap<>();

        map.put(Blocks.GRASS_BLOCK, new Pair<>(BlockItemRegistryEF.FROZEN_GRASS.getDefaultStack(), BlockItemRegistryEF.FROZEN_DIRT.getDefaultStack()));

        return map;
    }

    @Override
    public @Nullable HashMap<TagKey<Block>, Pair<ItemStack, ItemStack>> freezableTags() {
        HashMap<TagKey<Block>, Pair<ItemStack, ItemStack>> map = new HashMap<>();

        map.put(BlockTags.SAND, new Pair<>(BlockItemRegistryEF.FROZEN_SAND.getDefaultStack(), BlockItemRegistryEF.FROZEN_SAND.getDefaultStack()));
        map.put(BlockTags.DIRT, new Pair<>(BlockItemRegistryEF.FROZEN_DIRT.getDefaultStack(), BlockItemRegistryEF.FROZEN_DIRT.getDefaultStack()));

        return map;
    }
}
