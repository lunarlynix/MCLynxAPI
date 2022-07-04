package ca.lynix.lynxapi.hwidban;

import org.bukkit.entity.Player;
public class HWIDManager {
    public String generateLicenseKey(Player player)
    {


        return String.valueOf(player.getUniqueId());
    }
}
