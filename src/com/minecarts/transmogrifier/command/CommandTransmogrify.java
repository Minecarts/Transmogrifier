package com.minecarts.transmogrifier.command;

import com.minecarts.transmogrifier.Transmogrifier;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

public class CommandTransmogrify extends BaseCommandHandler{
    public CommandTransmogrify(Transmogrifier plugin){
        super(plugin);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        //Determine what type of entity they're wanting to transform into
        return true;
    }
}
