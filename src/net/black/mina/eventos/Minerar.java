package net.black.mina.eventos;

import java.util.Random;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

import net.black.mina.Drops;

public class Minerar implements Listener {
	
	@EventHandler
	public void quebrar(BlockBreakEvent event) {
		if (event.getPlayer().getWorld().getName().equals("mundo")) {
			event.setCancelled(true);
			event.getBlock().setType(Material.AIR);
			
			Random random = new Random();
			int indice = random.nextInt(8);
			
			if (indice == 1) {
				Drops.setCarvao(event.getPlayer().getName(), Drops.getCarvao(event.getPlayer().getName()) + 1);
			}
			
			if (indice == 2) {
				Drops.setLapis(event.getPlayer().getName(), Drops.getLapis(event.getPlayer().getName()) + 1);			
			}
			
			if (indice == 3) {
				Drops.setRedstone(event.getPlayer().getName(), Drops.getRedstone(event.getPlayer().getName()) + 1);
			}
			
			if (indice == 4) {
				Drops.setFerro(event.getPlayer().getName(), Drops.getFerro(event.getPlayer().getName()) + 1);
			}
			
			if (indice == 5) {
				Drops.setOuro(event.getPlayer().getName(), Drops.getOuro(event.getPlayer().getName()) + 1);
			}
			
			if (indice == 6) {
				Drops.setDiamante(event.getPlayer().getName(), Drops.getDiamante(event.getPlayer().getName()) + 1);
			}
			
			if (indice == 7) {
				Drops.setEsmeralda(event.getPlayer().getName(), Drops.getEsmeralda(event.getPlayer().getName()) + 1);
			}
		}
	}
}