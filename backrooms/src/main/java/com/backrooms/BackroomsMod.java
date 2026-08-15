package com.backrooms;

import net.fabricmc.api.ModInitializer;
import com.backrooms.registry.ModRegistry;

public class BackroomsMod implements ModInitializer {
    public static final String MODID = "backrooms";

    @Override
    public void onInitialize() {
        // Punto único de inicialización (lado común/servidor).
        ModRegistry.init();
        System.out.println("[Backrooms] Mod initialized.");
    }
}
