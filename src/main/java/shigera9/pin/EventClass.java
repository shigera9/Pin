package shigera9.pin;


import org.bukkit.Material;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;


public class EventClass implements Listener {


    @EventHandler
    public void onClick (PlayerInteractEvent e) {
        Player p = e.getPlayer();
        Action action = e.getAction();


        if (p.getInventory().getItemInMainHand().getType() == Material.ARROW){
            if(action == Action.RIGHT_CLICK_AIR || action == Action.RIGHT_CLICK_BLOCK) {
                p.launchProjectile(Arrow.class);  //右クリックしたら矢を撃つ
            }

        }

    }

}
