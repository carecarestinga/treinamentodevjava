package br.com.technocorp.abstract_factory;

public class Carro {

    private Roda roda;
    private Som som;

    public Roda getRoda() {
        return roda;
    }

    public void setRoda(Roda roda) {
        this.roda = roda;
    }

    public Som getSom() {
        return som;
    }

    public void setSom(Som som) {
        this.som = som;
    }
}
