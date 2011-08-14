package com.minecarts.transmogrifier.command;

import com.minecarts.transmogrifier.Transmogrifier;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public abstract class BaseCommandHandler implements CommandExecutor {
    protected final Transmogrifier plugin;

    public BaseCommandHandler(Transmogrifier plugin) {
        this.plugin = plugin;
    }

    public abstract boolean onCommand(CommandSender sender, Command command, String label, String[] args);
}