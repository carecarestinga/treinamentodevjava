package br.com.technocorp.decorator;

public class SorveteNapolitano extends  Sorvete  {
    public SorveteNapolitano() {
        this.setNome("Sorvete Napolitano");
    }

    @Override
    public int getQuantidadeBolas() {
        return 0;
    }

    @Override
    public double getPreco() {
        return 2.5;
    }
}
