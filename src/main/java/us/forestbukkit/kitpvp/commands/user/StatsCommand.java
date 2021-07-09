package us.forestbukkit.kitpvp.commands.user;

import us.forestbukkit.kitpvp.KitPvP;
import us.forestbukkit.kitpvp.user.User;
import us.forestbukkit.kitpvp.utils.command.BaseCommand;
import us.forestbukkit.kitpvp.utils.command.Command;
import us.forestbukkit.kitpvp.utils.command.CommandArgs;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import us.forestbukkit.kitpvp.utils.CC;

import static us.forestbukkit.kitpvp.utils.CC.translate;

public class StatsCommand extends BaseCommand {

    private final KitPvP plugin = KitPvP.getInstance();

    @Override
    @Command(name = "stats", aliases = {"stat"})
    public void onCommand(CommandArgs command) {
        Player player = command.getPlayer();
        String[] args = command.getArgs();

    player.sendMessage("Stats\n" + player);
    }
}
