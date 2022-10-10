package shigera9.pin;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class Pin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getConsoleSender().sendMessage(ChatColor.RED +"Pinプラグインが読み込まれました。");
        getCommand("pin").setExecutor(new CommandClass());
        getServer().getPluginManager().registerEvents(new EventClass(),this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
