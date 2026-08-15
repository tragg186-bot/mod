package com.backrooms.registry;

/**
 * Punto central para registros del mod. En FASE 1 no registramos items/entidades
 * para evitar referencias a recursos inexistentes.
 */
public class ModRegistry {
    public static void init() {
        // En fases posteriores: ItemRegistry.init(), EntityRegistry.init(), SoundRegistry.init(), etc.
    }
}
