package br.com.technocorp.decorator;

public class TesteDecorator {

    public static void main(String[] args) {

        Sorvete sorvete = new SorveteNapolitano();
        retornaInformacoes(sorvete);
        sorvete = new Creme(sorvete);
        sorvete = new Chocolate(sorvete);
        sorvete = new Morango(sorvete);
        retornaInformacoes(sorvete);

    }

    public static  void retornaInformacoes (Sorvete sorvete) {

        System.out.println( "Nome Sorvete = " + sorvete.getNome());
        System.out.println( "Numero Bolas = " + sorvete.getQuantidadeBolas());
        System.out.println( "Preco Sorvete = " + sorvete.getPreco());

    }

}
