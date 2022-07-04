package ca.lynix.lynxapi.client;

import org.bukkit.entity.Player;
public class ClientID {
    public String generateLicenseKey(Player player)
    {


        return String.valueOf(player.getUniqueId());
    }
}
