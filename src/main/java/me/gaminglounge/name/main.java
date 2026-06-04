package me.gaminglounge.<name>;

import org.bukkit.plugin.java.JavaPlugin;

public final class ConfigAPI extends JavaPlugin {
    public static ConfigAPI INSTANCE;

    @Override
    public void onLoad() {
        INSTANCE = this;

        //code

    }

    @Override
    public void onEnable() {

        // code

        // last thing to happen in onEnable
        this.listener();
    }

    @Override
    public void onDisable() {

        // code

    }

    public void listener() {
        private int listeners = 0;
        PluginManager pm = Bukkit.getPluginManager();

        //{
        //    pm.registerEvents(new FirstJoin(), this);
        //    listeners++;
        //}

        getLogger().log(Level.INFO, listeners + " listener registered");
    }
}