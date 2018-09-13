package br.com.technocorp.observer;

public class Candidato implements Observer {

    private String nome;


    public Candidato(String nome, Subject subject) {
        this.nome = nome;
        subject.adicionaObserver(this);
    }

    @Override
    public void update(String texto) {
        System.out.println(this.nome + " Vaga de Emprego = " + texto );
    }
}
