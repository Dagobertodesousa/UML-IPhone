package main;

import funcionalidade.*;

public class SmartPhone {
	public Browser browser;
	public Phone phone;
	public Player player;
	

	public SmartPhone() {
		this.browser = new Browser();
		this.phone= new Phone();
		this.player= new Player();
	}

	public static void main(String[] args) {
		SmartPhone device = new SmartPhone();
		device.player.nomeMusica = "por onde andei";
		System.out.println(device.player.tocar());
		device.player.selecionarMusica("sinhazinha");
		System.out.println(device.player.tocar());
		System.out.println(device.phone.atender());
		System.out.println(device.browser.exibirPagina("www.z-xcbio.br"));
		System.out.println(device.browser.atualizarPagina());
	}

}
