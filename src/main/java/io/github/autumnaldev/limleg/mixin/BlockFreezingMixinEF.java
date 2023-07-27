package io.github.autumnaldev.limleg.mixin;

import io.github.autumnaldev.limleg.module.eternal_frost.util.BlockLootFreezer;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockState;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.loot.context.LootContextParameterSet;
import net.minecraft.loot.context.LootContextParameters;
import net.minecraft.util.Pair;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.ArrayList;
import java.util.List;

@Mixin(AbstractBlock.class)
public class BlockFreezingMixinEF {

    @SuppressWarnings("DataFlowIssue")
    @Inject(method = "getDroppedStacks", at = @At("HEAD"), cancellable = true)
    public void freeze(BlockState state, LootContextParameterSet.Builder builder, CallbackInfoReturnable<List<ItemStack>> cir) {
        ItemStack stack = builder.get(LootContextParameters.TOOL);

        if (stack.getItem() instanceof BlockLootFreezer freezer) {
            if (freezer.freezableBlocks().containsKey(state.getBlock())) {
                ItemStack drop;
                Pair<ItemStack, ItemStack> pair = freezer.freezableBlocks().get(state.getBlock());

                if (pair.getLeft() == pair.getRight()) {
                    drop = pair.getLeft();
                } else {
                    if (EnchantmentHelper.hasSilkTouch(stack)) {
                        drop = pair.getLeft();
                    } else {
                        drop = pair.getRight();
                    }
                }

                ArrayList<ItemStack> list = new ArrayList<>();
                list.add(drop);

                cir.setReturnValue(list);
            }

            if (freezer.freezableTags() != null && !freezer.freezableBlocks().containsKey(state.getBlock())) {
                freezer.freezableTags().forEach((tag, drop) -> {
                    if (state.isIn(tag)) {
                        ArrayList<ItemStack> list = new ArrayList<>();
                        if (drop.getLeft() == drop.getRight()) {
                            list.add(drop.getLeft());
                        } else {
                            if (EnchantmentHelper.hasSilkTouch(stack)) {
                                list.add(drop.getLeft());
                            } else {
                                list.add(drop.getRight());
                            }
                        }
                        cir.setReturnValue(list);
                    }
                });
            }
        }
    }
}
