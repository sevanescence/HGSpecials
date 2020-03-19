package com.makotomiyamoto.hgspecials.listeners.damage;

import com.makotomiyamoto.hgspecials.meta.Particles;
import com.makotomiyamoto.hgspecials.meta.Projectiles;
import com.makotomiyamoto.hgspecials.meta.Template;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

import java.util.UUID;

public final class FireballBlast implements Listener {
    @EventHandler
    public void onBlast(EntityDamageByEntityEvent event) {
        if (event.getDamager().getCustomName() == null
                || !event.getDamager().getCustomName().contains(Projectiles.ProjectileHGFireball)) {
            return;
        }
        event.setDamage(3.0D);
        Entity target = event.getEntity();
        target.setFireTicks(100);
        Particles.surroundFlame(target);
        Player player = Bukkit.getPlayer(UUID.fromString(event.getDamager().getCustomName().split(",")[1]));
        assert player != null;
        player.sendMessage(Template.PREFIX + ChatColor.GRAY + "Dealt "
                + ChatColor.RED + "3.0 damage "
                + ChatColor.GRAY + "to "
                + ChatColor.YELLOW + target.getName()
                + ChatColor.GRAY + "!");
    }
}
