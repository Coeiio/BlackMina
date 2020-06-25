package net.black.mina;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.*;
import net.black.mina.commands.*;
import net.black.mina.eventos.*;

public class Main extends JavaPlugin {
	
	@Override
	public void onEnable() {
		Commands();
		Events();
	}
	
	@Override
	public void onDisable() {
	}
	
	private void Events() {
		Bukkit.getPluginManager().registerEvents(new Entrar(), this);
		Bukkit.getPluginManager().registerEvents(new Minerar(), this);
		Bukkit.getPluginManager().registerEvents(new Clicar(), this);
	}

	private void Commands() {
		getCommand("armazenamento").setExecutor(new Armazenamento());
	}
	
	public static Main getInstance() {
		return getPlugin(Main.class);
	}
}