package com.backrooms.client;

import net.fabricmc.api.ClientModInitializer;

public class ClientModEntrypoint implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        // Inicializaciones del lado cliente: HUD, renders y binds se añadiran en fases posteriores.
        System.out.println("[Backrooms] Client initialized.");
    }
}
