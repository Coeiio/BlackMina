package net.black.mina.utilidades;

import java.util.Arrays;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class BlackCreate {
	
    private ItemStack item;
    private ItemMeta meta;
    
    public BlackCreate(Material material) {
    	this.item = new ItemStack(material);
        this.meta = item.getItemMeta();
	}
    
    public BlackCreate quantidade(int quantidade) {
        item.setAmount(quantidade);
        return this;
    }
    
    public BlackCreate nome(String nome) {
        meta.setDisplayName(nome);
        return this;
    }
    
    public BlackCreate durabilidade(short durabilidade) {
        item.setDurability(durabilidade);
        return this;
    }
    
    public BlackCreate lore(String... lore) {
        meta.setLore(Arrays.asList(lore));
        return this;
    }
    
    public BlackCreate inquebravel(boolean inquebravel) {
        meta.spigot().setUnbreakable(inquebravel);
        return this;
    }
    
    public ItemStack build() {
        item.setItemMeta(meta);
        return item;
    }
}