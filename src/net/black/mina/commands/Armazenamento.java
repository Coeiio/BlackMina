package net.black.mina.commands;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import net.black.mina.*;
import net.black.mina.utilidades.*;

public class Armazenamento implements CommandExecutor {

	@SuppressWarnings("deprecation")
	@Override
	public boolean onCommand(CommandSender sender, Command comando, String label, String[] args) {
		if (!(sender instanceof Player)) {
			return true;
		}
		Player player = (Player)sender;
		String nome = sender.getName();
		
		if (label.equals("armazenamento")) {
			Inventory inventory = Bukkit.createInventory(player, 27, "Minérios");
			
			ItemStack carvao = new BlackCreate(Material.getMaterial(263))
					.nome("§aCarvão")
					.lore("§fQuantidade §a" + Drops.getCarvao(nome))
					.build();
			
			ItemStack lapis = new BlackCreate(Material.getMaterial(351))
					.durabilidade((short) 4)
					.nome("§aLápis Lazúli")
					.lore("§fQuantidade §a" + Drops.getLapis(nome))
					.build();
			
			ItemStack redstone = new BlackCreate(Material.getMaterial(331))
					.nome("§aRedstone")
					.lore("§fQuantidade §a" + Drops.getRedstone(nome))
					.build();
			
			ItemStack ferro = new BlackCreate(Material.getMaterial(265))
					.nome("§aFerro")
					.lore("§fQuantidade §a" + Drops.getFerro(nome))
					.build();
			
			ItemStack ouro = new BlackCreate(Material.getMaterial(266))
					.nome("§aOuro")
					.lore("§fQuantidade §a" + Drops.getOuro(nome))
					.build();
			
			ItemStack diamante = new BlackCreate(Material.getMaterial(264))
					.nome("§aDiamante")
					.lore("§fQuantidade §a" + Drops.getDiamante(nome))
					.build();
			
			ItemStack esmeralda = new BlackCreate(Material.getMaterial(388))
					.nome("§aEsmeralda")
					.lore("§fQuantidade §a" + Drops.getEsmeralda(nome))
					.build();
			
			inventory.setItem(10, carvao);
			inventory.setItem(11, lapis);
			inventory.setItem(12, redstone);
			inventory.setItem(13, ferro);
			inventory.setItem(14, ouro);
			inventory.setItem(15, diamante);
			inventory.setItem(16, esmeralda);
			
			player.openInventory(inventory);
		}
		return false;
	}
}