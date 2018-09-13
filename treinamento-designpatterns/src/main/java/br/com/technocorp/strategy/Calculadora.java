package br.com.technocorp.strategy;

public class Calculadora {

    private Operacao operacao;

    public Calculadora() {
    }

    public Calculadora(Operacao operacao) {
        this.operacao = operacao;
    }

    public void definirOperacao(Operacao operacao) {
        this.operacao = operacao;
    }

    public double realizarOperacao(double n1, double n2){
        return this.operacao.fazerOperacao(n1, n2);
    }

}
