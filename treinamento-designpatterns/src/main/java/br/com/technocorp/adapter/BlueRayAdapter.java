package br.com.technocorp.adapter;

public class BlueRayAdapter implements ReprodutorDeVideo {

    private BlueRayPlayer blueRayPlayer;

    public BlueRayAdapter(BlueRayPlayer blueRayPlayer) {
        this.blueRayPlayer = blueRayPlayer;
    }

    @Override
    public void reproduzir(String nome, String formato, boolean possuiAudio) {
        this.blueRayPlayer.executar(nome, formato, 0 );
    }
}
