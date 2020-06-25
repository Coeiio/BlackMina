package net.black.mina.eventos;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import net.black.mina.Main;

public class Entrar implements Listener {
	
	@EventHandler
	public void entrar(PlayerJoinEvent event) {
		String nome = event.getPlayer().getName();
		
		if (Main.getInstance().getConfig().getString("jogadores." + nome) == null) {
			Main.getInstance().getConfig().set("jogadores." + nome + ".carvao", 0);
			Main.getInstance().getConfig().set("jogadores." + nome + ".lapis", 0);
			Main.getInstance().getConfig().set("jogadores." + nome + ".redstone", 0);
			Main.getInstance().getConfig().set("jogadores." + nome + ".ferro", 0);
			Main.getInstance().getConfig().set("jogadores." + nome + ".ouro", 0);
			Main.getInstance().getConfig().set("jogadores." + nome + ".diamante", 0);
			Main.getInstance().getConfig().set("jogadores." + nome + ".esmeralda", 0);
			Main.getInstance().saveConfig();
		}
	}
}