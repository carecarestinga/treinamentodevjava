package br.com.technocorp.bridge_adapter;

import java.util.Calendar;


public class TesteBridgeAdapter {

	public static void main(String[] args) throws Exception {
		// regra de negocio
		Mapa mapa = new GoogleMaps();
		mapa.devolveMapa("rua vergueiro");
		// ...
		RelogioDoSistema relogio = new RelogioDoSistema();
		Calendar hoje = relogio.hoje();
	}
}
