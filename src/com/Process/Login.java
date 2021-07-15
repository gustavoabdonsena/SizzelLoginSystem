package com.Process;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import com.usuario.Users;

import java.util.ArrayList;
import java.util.List;

public class Login implements CommandExecutor {

    static final List<Users> logado = new ArrayList<>();

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String s, String[] args) {
        if(sender instanceof Player && cmd.getName().equalsIgnoreCase("register")){
            Player p = (Player) sender;
            p.sendMessage("Para registrar digita: /logar <Senha> <Senha>");

            if(Login.isLogado(p.getDisplayName())){
                p.sendMessage(" Você já está logado!");
            }else {
                if(true){
                    Users users = new Users(p.getDisplayName(),args[1]);
                    Login.logado.add(users);
                    p.sendMessage("Registrado com sucesso... BOM JOGO XD!");
                    p.setWalkSpeed(0.2F);

                }else{
                    p.sendMessage("EDITAR DEPOIS Class.Login");
                }
            }

        }
        return false;
    }

    static boolean isLogado(String name){
        for (Users user: logado) {
            if(user.getName().equalsIgnoreCase(name)){
                return true;
            }
        }
        return false;
    }
}
