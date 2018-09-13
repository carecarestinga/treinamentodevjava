package br.com.technocorp.composite;

public class Quadrado extends Figura{

    @Override
    public void desenhar() {
        System.out.print("#");
        for (Figura figura : super.getFiguras()){
            figura.desenhar();
        }
    }
}
