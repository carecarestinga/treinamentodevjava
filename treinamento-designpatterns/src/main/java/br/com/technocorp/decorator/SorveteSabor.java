package br.com.technocorp.decorator;

public abstract class SorveteSabor extends Sorvete {

    private Sorvete sorvete;

    public SorveteSabor(Sorvete sorvete) {
        this.sorvete = sorvete;
    }

    public Sorvete getSorvete() {
        return sorvete;
    }
}
