package com.coariz.coarizwildtp;

import net.milkbowl.vault.economy.Economy;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.RegisteredServiceProvider;
import org.bukkit.plugin.java.JavaPlugin;

public class CoarizWildTP extends JavaPlugin {

    private Economy econ = null;

    @Override
    public void onEnable() {
        getLogger().info("Loading CoarizWildTP...");

        saveDefaultConfig();

        if (!setupEconomy()) {
            getLogger().severe("Vault dependency not found! Disabling plugin.");
            getServer().getPluginManager().disablePlugin(this);
            return;
        }

        getCommand("wild").setExecutor(new WildTeleportCommand(this));
        getCommand("rtp").setExecutor(new WildTeleportCommand(this));

        getLogger().info("CoarizWildTP has been enabled!");
    }

    private boolean setupEconomy() {
        if (getServer().getPluginManager().getPlugin("Vault") == null) {
            getLogger().severe("Vault plugin not found!");
            return false;
        }

        RegisteredServiceProvider<Economy> rsp = getServer().getServicesManager().getRegistration(Economy.class);
        if (rsp == null) {
            getLogger().severe("No economy provider found!");
            return false;
        }

        econ = rsp.getProvider();
        return econ != null;
    }

    public FileConfiguration getConfig() {
        return super.getConfig();
    }

    public Economy getEconomy() {
        return econ;
    }
}