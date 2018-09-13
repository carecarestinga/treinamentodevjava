package br.com.technocorp.composite;

import java.util.ArrayList;
import java.util.List;

public abstract class Figura {

    private List<Figura> figuras;

    public abstract void desenhar();

    public Figura() {
        this.figuras = new ArrayList<Figura>();
    }

    public void adicionarFigura(Figura figura) {
        this.figuras.add(figura);
    }

    public List<Figura> getFiguras() {
        return figuras;
    }

    public void setFiguras(List<Figura> figuras) {
        this.figuras = figuras;
    }
}
