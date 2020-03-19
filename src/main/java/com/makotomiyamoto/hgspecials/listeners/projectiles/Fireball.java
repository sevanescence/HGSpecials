package com.makotomiyamoto.hgspecials.listeners.projectiles;

import com.makotomiyamoto.hgspecials.meta.Eval;
import com.makotomiyamoto.hgspecials.meta.Projectiles;
import com.makotomiyamoto.hgspecials.meta.Specials;
import org.bukkit.Sound;
import org.bukkit.SoundCategory;
import org.bukkit.entity.Player;
import org.bukkit.entity.SmallFireball;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

public final class Fireball implements Listener {
    @EventHandler
    public void onLaunch(PlayerInteractEvent event) {
        if (!Eval.shouldPassActionScript(event)
                || Eval.mightThrowAStupidNullError(event)
                || !Eval.match(event.getItem(), Specials.FIREBALL)) {
            return;
        }
        event.setCancelled(true);
        Player player = event.getPlayer();
        SmallFireball sf = player.launchProjectile(SmallFireball.class);
        sf.setCustomName(Projectiles.ProjectileHGFireball + "," + player.getUniqueId().toString());
        sf.setIsIncendiary(false);
        player.playSound(player.getLocation(), Sound.ENTITY_BLAZE_SHOOT, SoundCategory.NEUTRAL, 0.5f, 0.65f);
        player.getInventory().getItemInMainHand().setAmount(
                player.getInventory().getItemInMainHand().getAmount() - 1);
    }
}
