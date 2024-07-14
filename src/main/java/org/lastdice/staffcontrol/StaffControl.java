package org.lastdice.staffcontrol;

import com.comphenix.protocol.ProtocolLibrary;
import com.comphenix.protocol.ProtocolManager;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import org.lastdice.staffcontrol.command.Command;
import org.lastdice.staffcontrol.mob.SpawnHandler;
import org.lastdice.staffcontrol.mobControl.ControlHandler;
import org.lastdice.staffcontrol.sound.SoundAdapter;

public final class StaffControl extends JavaPlugin {

    public static StaffControl instance;



    @Override
    public void onEnable() {
        // Plugin startup logic
        //aaa

        Bukkit.getCommandMap().register("staff", new Command("game"));

        Bukkit.getPluginManager().registerEvents(new SpawnHandler(), this);

        Bukkit.getPluginManager().registerEvents(new ControlHandler(), this);

        instance = this;







    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
