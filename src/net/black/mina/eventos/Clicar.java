package net.black.mina.eventos;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

import net.black.mina.Drops;
import net.black.mina.utilidades.BlackCreate;

public class Clicar implements Listener {
	
	@SuppressWarnings({ "static-access", "deprecation" })
	@EventHandler
	public void clicar(InventoryClickEvent event) {
		Player player = (Player) event.getWhoClicked();
		String nome = event.getWhoClicked().getName();
		
		Drops drops = new Drops();
		
		if (event.getInventory().getName().equals("Minérios")) {
			event.setCancelled(true);
			
			if (event.getRawSlot() == 10) {
				if (drops.getCarvao(nome) < 1) {
					player.sendMessage("§cVocê não tem carvões suficientes para pegar.");
					return;
				}
				ItemStack carvao = new BlackCreate(Material.getMaterial(263))
						.quantidade(drops.getCarvao(nome))
						.build();
				
				player.getInventory().addItem(carvao);
				player.closeInventory();
				player.sendMessage("§aVocê coletou " + drops.getCarvao(nome) + " carvões.");
				drops.setCarvao(nome, 0);
			}
			if (event.getRawSlot() == 11) {
				if (drops.getLapis(nome) < 1) {
					player.sendMessage("§cVocê não tem lápis lazúli suficiente para pegar.");
					return;
				}
				ItemStack lapis = new BlackCreate(Material.getMaterial(351))
						.durabilidade((short) 4)
						.quantidade(drops.getLapis(nome))
						.build();
				
				
				player.getInventory().addItem(lapis);
				player.closeInventory();
				player.sendMessage("§aVocê coletou " + drops.getLapis(nome) + " lápis lazúli.");
				drops.setLapis(nome, 0);
			}
			if (event.getRawSlot() == 12) {
				if (drops.getRedstone(nome) < 1) {
					player.sendMessage("§cVocê não tem redstone suficiente para pegar.");
					return;
				}
				ItemStack redstone = new BlackCreate(Material.getMaterial(331))
						.quantidade(drops.getRedstone(nome))
						.build();
				
				player.getInventory().addItem(redstone);
				player.closeInventory();
				player.sendMessage("§aVocê coletou " + drops.getRedstone(nome) + " redstone.");
				drops.setRedstone(nome, 0);
			}
			if (event.getRawSlot() == 13) {
				if (drops.getFerro(nome) < 1) {
					player.sendMessage("§cVocê não tem ferro suficiente para pegar.");
					return;
				}
				ItemStack ferro = new BlackCreate(Material.getMaterial(265))
						.quantidade(drops.getFerro(nome))
						.build();
				
				player.getInventory().addItem(ferro);
				player.closeInventory();
				player.sendMessage("§aVocê coletou " + drops.getFerro(nome) + " ferros.");
				drops.setFerro(nome, 0);
			}
			if (event.getRawSlot() == 14) {
				if (drops.getOuro(nome) < 1) {
					player.sendMessage("§cVocê não tem ouro suficiente para pegar.");
					return;
				}
				ItemStack ouro = new BlackCreate(Material.getMaterial(266))
						.quantidade(drops.getOuro(nome))
						.build();
				
				player.getInventory().addItem(ouro);
				player.closeInventory();
				player.sendMessage("§aVocê coletou " + drops.getOuro(nome) + " ouros.");
				drops.setOuro(nome, 0);
			}
			if (event.getRawSlot() == 15) {
				if (drops.getDiamante(nome) < 1) {
					player.sendMessage("§cVocê não tem diamante suficiente para pegar.");
					return;
				}
				ItemStack diamante = new BlackCreate(Material.getMaterial(264))
						.quantidade(drops.getDiamante(nome))
						.build();
				
				player.getInventory().addItem(diamante);
				player.closeInventory();
				player.sendMessage("§aVocê coletou " + drops.getDiamante(nome) + " diamantes.");
				drops.setDiamante(nome, 0);
			}
			if (event.getRawSlot() == 16) {
				if (drops.getEsmeralda(nome) < 1) {
					player.sendMessage("§cVocê não tem esmeralda suficiente para pegar.");
					return;
				}
				ItemStack esmeralda = new BlackCreate(Material.getMaterial(388))
						.quantidade(drops.getEsmeralda(nome))
						.build();
				
				player.getInventory().addItem(esmeralda);
				player.closeInventory();
				player.sendMessage("§aVocê coletou " + drops.getEsmeralda(nome) + " esmeraldas.");
				drops.setEsmeralda(nome, 0);
			}
		}
	}
}