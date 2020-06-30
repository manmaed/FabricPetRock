package net.manmaed.petrock.command;

import net.fabricmc.fabric.api.registry.CommandRegistry;
import net.manmaed.petrock.libs.Reference;
import net.minecraft.server.command.CommandManager;

import static com.mojang.brigadier.arguments.IntegerArgumentType.integer;

/**
 * Created by manmaed on 17/12/2019.
 */
public class PRCommands {
    public static void load() {
        /*CommandRegistry.INSTANCE.register(false, dispatcher -> { // You can also just reference every single class also. There is also the alternative of just using CommandRegistry
            dispatcher.register(CommandManager.literal(Reference.MOD_ID)
                    *//*.then(CommandSetHat.register(dispatcher))*//*
                    .then(CommandIASP101.register(dispatcher))
            );
        });*/
    }
}
