package br.com.technocorp.composite;

public class TesteComposite {

    public static void main(String[] args) {

        System.out.println();
        System.out.println( " Figura 1 ");
        Figura figura1 = new Quadrado();
        figura1.adicionarFigura(new Quadrado());
        figura1.desenhar();

        System.out.println();
        System.out.println( " Figura 2 ");
        Figura figura2 = new Circulo();
        figura2.adicionarFigura(new Quadrado());
        figura2.desenhar();

    }


}
