package _02_observer.self_implementation;

public interface Subject {
    
    public void registerObserver(Observer o);

    public void removeObserver(Observer o);

    public void notifyObservers();

}
