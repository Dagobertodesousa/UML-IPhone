package funcionalidade;

public class Player {
	public String nomeMusica;
	
	public Player() {}
	
	public String tocar() {
		return "Tocando musica: " + this.nomeMusica;
	}
	
	public String pausar() {
		return "pausando música: " + this.nomeMusica;
	}
	
	public void selecionarMusica(String nome_Musica) {
		this.nomeMusica = nome_Musica;
	}
}
