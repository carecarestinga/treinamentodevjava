package br.com.technocorp.adapter;

public class BlueRayPlayer {

    public void executar(String nome, String formato, double tamanho) {
        System.out.print("Reproduzindo video ....");
        System.out.print("\" " + nome + "\" " +" no Formato " + formato);
        System.out.println(" com tamanho" + tamanho);
    }


}
