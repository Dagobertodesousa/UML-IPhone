package funcionalidade;

public class Phone {
	
	public Phone() {}

	public String encerrarChamada() {
		return "chamada encerrada";
	}
	
	public String ligar(String Contato) {
		return "Realizado chamada para: " + Contato;
	}
	
	public String atender() {
		return "chamada em curso";
	}

	public String iniciarCorreiosDeVoz() {
		return "Iniciado desvio de chamada para caixa postal";
	}
}
