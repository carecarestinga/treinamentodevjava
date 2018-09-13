package br.com.technocorp.strategy;

public class TesteStrategy {

    public static void main(String[] args) {

        Calculadora calculadora1 = new Calculadora();
        calculadora1.definirOperacao(new Soma());
        System.out.println("Resultado da Soma = " + calculadora1.realizarOperacao(10, 4));

        Calculadora calculadora2 = new Calculadora();
        calculadora2.definirOperacao(new Multiplicacao());
        System.out.println("Resultado da Multiplicação = " + calculadora2.realizarOperacao(10, 4));



    }

}
