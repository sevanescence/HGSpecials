package com.makotomiyamoto.hgspecials.listeners.projectiles;

import com.makotomiyamoto.hgspecials.meta.Eval;
import com.makotomiyamoto.hgspecials.meta.Specials;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

public final class Fireball implements Listener {
    @EventHandler
    public void onLaunch(PlayerInteractEvent event) {
        if (!Eval.shouldPassActionScript(event) || Eval.mightThrowAStupidNullError(event)) {
            return;
        }
        assert event.getItem() != null && event.getItem().getItemMeta() != null;

    }
}
