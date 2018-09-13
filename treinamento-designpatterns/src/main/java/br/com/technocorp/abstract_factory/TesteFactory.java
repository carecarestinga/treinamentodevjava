package br.com.technocorp.abstract_factory;

public class TesteFactory {

    private  static Carro montarCarro(char tipo) {
        CarroFactory carroFactory = null;

        switch (tipo) {
            case 'l':
                new CarroLuxoFactory();
                break;
            case 'p':
                new CarroPopularFactory();
                break;
        }

        Carro carro = new Carro();
        carro.setRoda(carroFactory.montarRoda());
        carro.setSom(carroFactory.montarSom());

        return carro;

    }

    public static void main(String[] args) {

        Carro carro1 = montarCarro('l');
        Carro carro2 = montarCarro('p');
        System.out.println("Imprimindo Carro1 = " + carro1);
        System.out.println("Imprimindo Carro2 = " + carro2);

    }


}
