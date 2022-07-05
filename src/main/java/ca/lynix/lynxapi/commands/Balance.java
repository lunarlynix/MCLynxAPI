package ca.lynix.lynxapi.commands;

import ca.lynix.lynxapi.resources.API;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Balance implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player player = (Player) sender;
        int balance = API.getBalance(player);

        if(sender instanceof Player) {
            player.sendMessage(ChatColor.translateAlternateColorCodes('&',"Your ARX balance is &b" + balance + "$"));
        }
        return true;
    }
}
