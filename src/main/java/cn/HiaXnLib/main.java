package cn.HiaXnLib;

import cn.HiaXnLib.API.LibUtil;
import cn.HiaXnLib.API.LibUtilCls;
import org.bukkit.Bukkit;
import org.bukkit.plugin.ServicePriority;
import org.bukkit.plugin.java.JavaPlugin;

public final class main extends JavaPlugin {

    @Override
    public void onEnable() {
        getConfig().options().copyDefaults(true);
        saveDefaultConfig();
        Bukkit.getServicesManager().register(LibUtil.class,new LibUtilCls(),this, ServicePriority.High);
    }
    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
