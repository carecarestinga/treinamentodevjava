package br.com.technocorp.observer;

import java.util.ArrayList;
import java.util.List;

public class HeadHunter implements Subject {

    private List<Observer> observers;
    private List<String> oportunidades;

    public HeadHunter() {
        this.observers = new ArrayList<Observer>();
        this.oportunidades = new ArrayList<String>();
    }

    @Override
    public void adicionaObserver(Observer observer) {
        this.observers.add(observer);
    }

    public void buscaOportunidade(String oportunidade) {
        this.oportunidades.add(oportunidade);
        this.notifyAllObservers();
    }

    @Override
    public void removeObserver(Observer observer) {
        int indice = this.observers.indexOf(observer);
        if (indice >= 0) {
            this.observers.remove(observer);
        }
    }

    @Override
    public void notifyAllObservers() {

        for ( Observer observer : observers ) {
            observer.update(this.oportunidades.get(this.oportunidades.size() - 1));
        }

    }
}
