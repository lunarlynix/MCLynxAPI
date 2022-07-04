package ca.lynix.lynxapi.commands;

import ca.lynix.lynxapi.hwidban.HWIDManager;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class MyHWID implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player player = (Player) sender;
        if(sender instanceof Player) {
            HWIDManager hwidm = new HWIDManager();
            player.sendMessage(ChatColor.translateAlternateColorCodes('&',"&cYour LynxAPI Client Key is &b" + hwidm.generateLicenseKey(player) + ""));
        }
        return true;
    }
}
