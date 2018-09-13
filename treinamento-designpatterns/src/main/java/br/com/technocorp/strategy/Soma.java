package br.com.technocorp.strategy;

public class Soma implements Operacao {


    @Override
    public double fazerOperacao(double n1, double n2) {
        return n1 + n2;
    }
}
