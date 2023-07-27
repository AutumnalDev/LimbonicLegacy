package io.github.autumnaldev.limleg.module.eternal_frost.util;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.Identifier;

import java.util.HashMap;

public interface EntityLootFreezer {
    HashMap<EntityType<? extends LivingEntity>, Identifier> freezables();
}
