package io.github.autumnaldev.limleg;

import io.github.autumnaldev.limleg.module.candycraft.ModuleInitCandy;
import io.github.autumnaldev.limleg.module.eternal_frost.ModuleInitEF;
import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class LimbonicLegacy implements ModInitializer {
    public static final Logger LOGGER = LogManager.getLogger("Limbonic Legacy");

    @Override
    public void onInitialize() {
        ModuleInitEF.run();
        ModuleInitCandy.run();
    }
}