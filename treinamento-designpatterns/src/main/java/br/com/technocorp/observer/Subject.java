package br.com.technocorp.observer;

public interface Subject {

    public void adicionaObserver(Observer observer);

    public void removeObserver(Observer observer);

    public void notifyAllObservers();


}
