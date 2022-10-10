package shigera9.pin;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

import static org.bukkit.Bukkit.getLogger;


public class CommandClass implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
        if(cmd.getName().equalsIgnoreCase("pin")) {
            if (sender instanceof Player) {
                Player p = (Player) sender;
                PlayerInventory inv = p.getInventory();

                p.sendMessage("右手に矢を持って右クリックしたら、ピンが差せます。");
                inv.addItem(new ItemStack(Material.ARROW,1));

            } else {
                getLogger().info("このコマンドはプレイヤーしか実行出来ません。");
            }
        }
        return false;
    }

}
