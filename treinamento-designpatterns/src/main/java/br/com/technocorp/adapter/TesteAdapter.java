package br.com.technocorp.adapter;

public class TesteAdapter {

    public static void main(String[] args) {

        ReprodutorDeVideo reprodutorDeVideo1 = new VideoCassete();
        reprodutorDeVideo1.reproduzir("Duro de Matar 4", "NSTC", true);

        ReprodutorDeVideo reprodutorDeVideo2 = new DvD();
        reprodutorDeVideo2.reproduzir("Duro de Matar 1", "DVD Player", false);

        ReprodutorDeVideo reprodutorDeVideo3 = new BlueRayAdapter(new BlueRayPlayer());
        reprodutorDeVideo1.reproduzir("Duro de Matar 2", "BlueRayPlayer", true);

    }

}
