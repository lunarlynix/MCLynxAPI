package ca.lynix.lynxapi;

import ca.lynix.lynxapi.commands.MyClientID;
import ca.lynix.lynxapi.commands.Status;
import ca.lynix.lynxapi.events.alerts.SendAlert;
import org.bukkit.command.CommandExecutor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class LynxAPI extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("LynxAPI Enabled Succesfully!");
        this.getCommand("clientid").setExecutor((CommandExecutor)new MyClientID());
        this.getCommand("status").setExecutor((CommandExecutor)new Status());

        getServer().getPluginManager().registerEvents(this, this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        System.out.println("[LynxAPI] Player joined server; checking for alerts...");
        Player player = event.getPlayer();
        SendAlert.AlertMsg(player);
    }
}
