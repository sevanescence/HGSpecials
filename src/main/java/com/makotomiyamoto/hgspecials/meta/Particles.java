package com.makotomiyamoto.hgspecials.meta;

import org.bukkit.Particle;
import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;

public abstract class Particles {
    public static void surroundHearts(Player player) {
        player.spawnParticle(Particle.HEART,
                player.getLocation().add(0, 1.5, 0),
                7, 0.5, 0.5, 0.5);
    }
    public static void surroundFlame(Entity entity) {
        World world = entity.getWorld();
        world.spawnParticle(Particle.FLAME,
                entity.getLocation().add(0, 1.5, 0),
                14, 0.5, 0.5, 0.5);
    }
}
