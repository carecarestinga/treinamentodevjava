package br.com.technocorp.abstract_factory;

public class CarroLuxoFactory extends CarroFactory {
    @Override
    public Roda montarRoda() {
        return new RodaLigaLeve();
    }

    @Override
    public Som montarSom() {
        return new CdPlayer();
    }
}
