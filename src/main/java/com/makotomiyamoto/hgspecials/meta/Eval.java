package com.makotomiyamoto.hgspecials.meta;

import org.bukkit.Material;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public abstract class Eval {
    public static boolean shouldPassActionScript(PlayerInteractEvent event) {
        if (!(event.getAction().equals(Action.RIGHT_CLICK_AIR) || event.getAction().equals(Action.RIGHT_CLICK_BLOCK))) {
            return false;
        }
        if (event.getClickedBlock() != null && Eval.isTypicallyInteractable(event.getClickedBlock().getType())) {
            return false;
        }
        return true;
        // i could just put this into a single if statement, but no thanks.
    }
    public static boolean isTypicallyInteractable(Material material) {
        switch (material) {
            case ANVIL:
            case BARREL:
            case CAKE:
            case CHEST:
            case DAMAGED_ANVIL:
            case DARK_OAK_DOOR:
            case ACACIA_DOOR:
            case BIRCH_DOOR:
            case IRON_DOOR:
            case JUNGLE_DOOR:
            case OAK_DOOR:
            case SPRUCE_DOOR:
            case ENDER_CHEST:
            case ENCHANTING_TABLE:
            case FURNACE:
                return true;
            default:
                return false;
        }
    }
    public static boolean mightThrowAStupidNullError(PlayerInteractEvent event) {
        return (event.getItem() == null || event.getItem().getType().equals(Material.AIR));
    }

}
