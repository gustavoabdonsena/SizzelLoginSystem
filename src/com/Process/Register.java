package com.Process;

import com.mysql.jdbc.log.Log;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import com.usuario.Users;

public class Register implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String s, String[] arg) {

        if(sender instanceof Player && cmd.getName().equalsIgnoreCase("register")){
                Player p = (Player) sender;
                p.sendMessage("Para registrar digita: /register <Senha> <Senha>");

                if(Login.isLogado(p.getDisplayName())){
                    p.sendMessage(" Você já está registrado! /login para logar.");
                }else {
                    if(arg[0].equals(arg[1])){
                        Users users = new Users(p.getDisplayName(),arg[1]);
                        Login.logado.add(users);
                        p.sendMessage("Registrado com sucesso... BOM JOGO XD!");
                        p.setWalkSpeed(0.2F);

                    }else{
                        p.sendMessage("As senhas devem coincidir, exemplo-> /register 123 123");
                    }
                }

            }

        return false;
    }
}
