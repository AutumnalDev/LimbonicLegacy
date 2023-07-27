package io.github.autumnaldev.limleg.mixin;

import io.github.autumnaldev.limleg.module.eternal_frost.util.BlockLootFreezer;
import io.github.autumnaldev.limleg.module.eternal_frost.util.EntityLootFreezer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.context.LootContextParameterSet;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

@Mixin(LivingEntity.class)
public abstract class LootFreezingMixinEF {
    @Shadow public abstract long getLootTableSeed();

    @Inject(
        method = "dropLoot", at = @At(
            value = "INVOKE",
            target = "Lnet/minecraft/loot/LootTable;generateLoot(Lnet/minecraft/loot/context/LootContextParameterSet;JLjava/util/function/Consumer;)V",
            shift = At.Shift.BEFORE
        ),
        locals = LocalCapture.CAPTURE_FAILHARD,
        cancellable = true
    )
    public void freeze(
        DamageSource source,
        boolean player,
        CallbackInfo ci,
        Identifier identifier,
        LootTable table,
        LootContextParameterSet.Builder builder,
        LootContextParameterSet parameters
    ) {
        Entity reference = (Entity) (Object) this;
        if (source.getAttacker() instanceof LivingEntity living) {
            System.out.println("Main Hand Stack: " + living.getMainHandStack());
            ci.cancel();

            if (living.getMainHandStack().getItem() instanceof EntityLootFreezer freezer) {
                if (freezer.freezables().containsKey(reference.getType())) {
                    Identifier name = freezer.freezables().get(reference.getType());
                    LootTable loot = reference.getWorld().getServer().getLootManager().getLootTable(name);
                    loot.generateLoot(parameters, this.getLootTableSeed(), reference::dropStack);
                    ci.cancel();
                }
            }
        }
    }
}
