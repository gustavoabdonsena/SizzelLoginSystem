package com.Process;

import com.usuario.Users;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Debugar implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command cmd, String s, String[] args) {

        Player p = (Player) sender;

        p.sendMessage(Login.logado.toString());

        return false;
    }
}
