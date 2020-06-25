package net.black.mina;

public class Drops {
	
	public static int getCarvao(String player) {
		return Main.getInstance().getConfig().getInt("jogadores." + player + ".carvao");
	}
	
	public static void setCarvao(String player, int quantia) {
		Main.getInstance().getConfig().set("jogadores." + player + ".carvao", quantia);
		Main.getInstance().saveConfig();
	}
	
	public static int getLapis(String player) {
		return Main.getInstance().getConfig().getInt("jogadores." + player + ".lapis");
	}
	
	public static void setLapis(String player, int quantia) {
		Main.getInstance().getConfig().set("jogadores." + player + ".lapis", quantia);
		Main.getInstance().saveConfig();
	}
	
	public static int getRedstone(String player) {
		return Main.getInstance().getConfig().getInt("jogadores." + player + ".redstone");
	}
	
	public static void setRedstone(String player, int quantia) {
		Main.getInstance().getConfig().set("jogadores." + player + ".redstone", quantia);
		Main.getInstance().saveConfig();
	}
	
	public static int getFerro(String player) {
		return Main.getInstance().getConfig().getInt("jogadores." + player + ".ferro");
	}
	
	public static void setFerro(String player, int quantia) {
		Main.getInstance().getConfig().set("jogadores." + player + ".ferro", quantia);
		Main.getInstance().saveConfig();
	}
	
	public static int getOuro(String player) {
		return Main.getInstance().getConfig().getInt("jogadores." + player + ".ouro");
	}
	
	public static void setOuro(String player, int quantia) {
		Main.getInstance().getConfig().set("jogadores." + player + ".ouro", quantia);
		Main.getInstance().saveConfig();
	}
	
	public static int getDiamante(String player) {
		return Main.getInstance().getConfig().getInt("jogadores." + player + ".diamante");
	}
	
	public static void setDiamante(String player, int quantia) {
		Main.getInstance().getConfig().set("jogadores." + player + ".diamante", quantia);
		Main.getInstance().saveConfig();
	}
	
	public static int getEsmeralda(String player) {
		return Main.getInstance().getConfig().getInt("jogadores." + player + ".esmeralda");
	}
	
	public static void setEsmeralda(String player, int quantia) {
		Main.getInstance().getConfig().set("jogadores." + player + ".esmeralda", quantia);
		Main.getInstance().saveConfig();
	}
}