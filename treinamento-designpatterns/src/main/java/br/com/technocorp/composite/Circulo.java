package br.com.technocorp.composite;

public class Circulo extends Figura {



    @Override
    public void desenhar() {
        System.out.print("O");
        for (Figura figura : super.getFiguras()){
            figura.desenhar();
        }
    }
}
