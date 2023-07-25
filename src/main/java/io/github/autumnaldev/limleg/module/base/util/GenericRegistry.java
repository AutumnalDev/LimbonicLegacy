package io.github.autumnaldev.limleg.module.base.util;

import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import java.util.HashMap;

public class GenericRegistry<T> {
    private final Registry<T> registry;
    private final HashMap<Identifier, T> objects = new HashMap<>();

    protected GenericRegistry(Registry<T> registry) {
        this.registry = registry;
    }

    protected T register(String name, T whatever) {
        objects.put(new Identifier("limboniclegacy", name), whatever);
        return whatever;
    }

    public void register() {
        objects.forEach((resource, whatever) -> Registry.register(this.registry, resource, whatever));
    }
}
