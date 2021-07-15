package com;

import com.Process.Debugar;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;
import com.Process.Login;
import com.Process.Register;

public class SizzelLoginCore extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info(ChatColor.LIGHT_PURPLE + "SizzelLogin foi" + ChatColor.GREEN + " ATIVADO");
        getCommand("login").setExecutor(new Login());
        getCommand("register").setExecutor(new Register());
        getCommand("debugar").setExecutor(new Debugar());
    }

    @Override
    public void onDisable() {

    }
}
