package com.usuario;

import org.bukkit.ChatColor;

public class Users {

    String password;
    String name;

    public Users(String name, String password){
        this.name = name;
        this.password = password;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public String toString() {
        return "Teste--> Nome: "
                + ChatColor.GREEN + name
                + " Senha: "
                + ChatColor.RED + password + " ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Users users = (Users) o;

        return password != null ? password.equals(users.password) : users.password == null;
    }

    @Override
    public int hashCode() {
        return password != null ? password.hashCode() : 0;
    }
}
