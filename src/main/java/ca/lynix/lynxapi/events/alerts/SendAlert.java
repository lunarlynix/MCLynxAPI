package ca.lynix.lynxapi.events.alerts;

import ca.lynix.lynxapi.resources.API;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class SendAlert {
    public static void AlertMsg(Player player) {
        try {
            if(API.getAlert() != null || API.getAlert() != "") {
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&c&lALERT --------------------------------"));
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&c" + API.getAlert()));
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&c&l--------------------------------------"));
            } else {
                System.out.println("[LynxAPI] No Alerts Available.");
            }
        } catch (Exception e) {
            System.out.println("[LynxAPI] Failed to get JSON Alert Msgs! Is the API offline?");
        }
    }
}
