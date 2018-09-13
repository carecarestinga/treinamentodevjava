package br.com.technocorp.abstract_factory;

public class CarroPopularFactory extends CarroFactory {
    @Override
    public Roda montarRoda() {
        return new RodaSimples();
    }

    @Override
    public Som montarSom() {
        return new TocaFitas();
    }
}
