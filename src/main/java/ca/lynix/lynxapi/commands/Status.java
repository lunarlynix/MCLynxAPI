package ca.lynix.lynxapi.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Status implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player player = (Player) sender;
        if(sender instanceof Player) {
            player.sendMessage(ChatColor.translateAlternateColorCodes('&',"Connection Status to LynxAPI"));
            player.sendMessage(ChatColor.translateAlternateColorCodes('&',"&7&lSTATUS : --------------------------------"));
            player.sendMessage(ChatColor.translateAlternateColorCodes('&',"&7Connection Status : &a&lCONNECTED"));
            player.sendMessage(ChatColor.translateAlternateColorCodes('&',"&7Connection Latency : &c&lUNKNOWN"));
            player.sendMessage(ChatColor.translateAlternateColorCodes('&',"&7Client ID : &c&lUNKNOWN"));
            player.sendMessage(ChatColor.translateAlternateColorCodes('&',"&7&lALERTS : --------------------------------"));
            player.sendMessage(ChatColor.translateAlternateColorCodes('&',"&aThere are no alerts at this time."));
        }
        return true;
    }
}
