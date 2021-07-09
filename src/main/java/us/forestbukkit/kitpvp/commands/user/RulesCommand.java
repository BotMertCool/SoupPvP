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

public class RulesCommand extends BaseCommand {

    private final KitPvP plugin = KitPvP.getInstance();

    @Override
    @Command(name = "rules", aliases = {"rule"})
    public void onCommand(CommandArgs command) {
        Player player = command.getPlayer();
        String[] args = command.getArgs();

        if (args.length < 2) {
            player.sendMessage(CC.translate("As we're in beta there are not many rules. For the rules we currently have check our discord discord.gg/vexrip"));
            return;
        }

    }
}