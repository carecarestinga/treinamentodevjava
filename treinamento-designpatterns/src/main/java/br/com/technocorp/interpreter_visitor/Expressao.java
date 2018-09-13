package br.com.technocorp.interpreter_visitor;

public interface Expressao {
	public int avalia();
	void aceita(Visitor impressora);
}
