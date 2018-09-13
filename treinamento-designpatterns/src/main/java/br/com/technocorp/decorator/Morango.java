package br.com.technocorp.decorator;

public class Morango extends SorveteSabor {
    public Morango(Sorvete sorvete) {
        super(sorvete);
    }

    @Override
    public int getQuantidadeBolas() {
        return 1 + getSorvete().getQuantidadeBolas();
    }

    @Override
    public double getPreco() {
        return 1.75 +getSorvete().getQuantidadeBolas();
    }
}
