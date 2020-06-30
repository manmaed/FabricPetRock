package net.manmaed.petrock.command;

import com.mojang.brigadier.Command;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import net.manmaed.petrock.libs.PRHats;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.command.CommandSource;
import net.minecraft.server.command.ServerCommandSource;

/**
 * Created by manmaed on 29/11/2019.
 */

public class CommandIASP101 implements Command<CommandSource> {
    /*public static void register(CommandDispatcher<ServerCommandSource> dispatcher) {
        dispatcher.register(CommandManager.literal("iamslowpoke101")
        .requires(cs -> cs.hasPermissionLevel(0))
                .executes(PRHats.slowisplaying());
    }*/

    public static ArgumentBuilder<CommandSource, ?> register(CommandDispatcher<CommandSource> dispatcher) {
        return dispatcher.

    }

    @Override
    public int run(CommandContext<CommandSource> context) throws CommandSyntaxException {
        return 0;
    }
}
