package br.com.technocorp.observer;

public class TesteObserver {

    public static void main(String[] args) {

        HeadHunter headHunter = new HeadHunter();
        headHunter.buscaOportunidade(" Vaga de Dev Java Junior");

        Observer candidato1 = new Candidato("Carlos", headHunter);
        Observer candidato2 = new Candidato("Maria", headHunter);

        headHunter.buscaOportunidade("Vaga de Dev Java Pleno");

        Observer candidato3 = new Candidato("Resley", headHunter);

        headHunter.buscaOportunidade("Vaga de Dev Java Senior");

    }


}
