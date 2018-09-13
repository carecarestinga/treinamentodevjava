package br.com.technocorp.decorator;

public class Chocolate extends SorveteSabor {
    public Chocolate(Sorvete sorvete) {
        super(sorvete);
    }

    @Override
    public int getQuantidadeBolas() {
        return 1 + getSorvete().getQuantidadeBolas();
    }

    @Override
    public double getPreco() {
        return 1.5 + getSorvete().getPreco();
    }
}
