package com.minecarts.transmogrifier;

import com.minecarts.transmogrifier.command.CommandTransmogrify;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.plugin.PluginManager;

public class Transmogrifier extends JavaPlugin{
    public void onEnable() {
        //Register events
            PluginManager pm = getServer().getPluginManager();
            //pm.registerEvent(Event.Type.PLAYER_JOIN, this.playerListener, Event.Priority.Monitor, this);

        //Register commands
        getCommand("transmog").setExecutor(new CommandTransmogrify(this));

    }

    public void onDisable(){
        //Close any existing connections
    }
}
