package _12_compound;

public interface QuackObservable {

    public void registerObserver(QuackObserver quackObserver);

    public void notifyObservers();

}
