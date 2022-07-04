package ca.lynix.lynxapi.events.alerts;

import ca.lynix.lynxapi.resources.Fetcher;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class SendAlert {
    public static void AlertMsg(Player player) {
        try {
            if(Fetcher.getAlert() != null) {
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&c&lALERT --------------------------------"));
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&c" + Fetcher.getAlert()));
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&c&l--------------------------------------"));
            }
        } catch (Exception e) {
            System.out.println("[LynxAPI] Failed to get JSON Alert Msgs! Is the API offline?");
        }
    }
}
