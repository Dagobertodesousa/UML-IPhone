package funcionalidade;

public class Browser {
	public String url;
	public Browser() {}

	public String adicionarAba() {
		return "Nova aba aberta.";
	}
	
	public String atualizarPagina() {
		return "Recarregando página: " + this.url;
	}
	
	public String exibirPagina(String pagina) {
		this.url = pagina;
		return "Exibindo pagina " + this.url;
	}

}
