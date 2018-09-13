package br.com.technocorp.decorator;

public class Creme extends SorveteSabor {
    public Creme(Sorvete sorvete) {
        super(sorvete);
    }

    @Override
    public int getQuantidadeBolas() {
        return 1 + getSorvete().getQuantidadeBolas();
    }

    @Override
    public double getPreco() {
        return 1.25 + getSorvete().getPreco();
    }
}
