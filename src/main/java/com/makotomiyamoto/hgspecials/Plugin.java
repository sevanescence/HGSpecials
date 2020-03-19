package com.makotomiyamoto.hgspecials;

import com.makotomiyamoto.hgspecials.listeners.consumeable.Spinach;
import com.makotomiyamoto.hgspecials.listeners.damage.FireballBlast;
import com.makotomiyamoto.hgspecials.listeners.projectiles.Fireball;
import org.bukkit.plugin.java.JavaPlugin;

public final class Plugin extends JavaPlugin {
    @Override
    public void onEnable() {
        this.getServer().getPluginManager().registerEvents(new Spinach(), this);
        this.getServer().getPluginManager().registerEvents(new Fireball(), this);
        this.getServer().getPluginManager().registerEvents(new FireballBlast(), this);
    }
}
