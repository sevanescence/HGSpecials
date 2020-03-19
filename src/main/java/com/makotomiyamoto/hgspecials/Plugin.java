package com.makotomiyamoto.hgspecials;

import com.makotomiyamoto.hgspecials.listeners.consumeable.Spinach;
import org.bukkit.plugin.java.JavaPlugin;

public final class Plugin extends JavaPlugin {
    @Override
    public void onEnable() {
        this.getServer().getPluginManager().registerEvents(new Spinach(), this);
    }
}
