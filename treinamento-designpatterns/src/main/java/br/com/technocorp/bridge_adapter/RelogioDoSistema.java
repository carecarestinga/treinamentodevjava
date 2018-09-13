package br.com.technocorp.bridge_adapter;

import java.util.Calendar;

public class RelogioDoSistema implements Relogio{
	public Calendar hoje(){
		return Calendar.getInstance();
	}
}
