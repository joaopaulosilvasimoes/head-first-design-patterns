package _12_compound;

public class DuckCall implements Quackable {

    QuackObservable quackObservable;

    public DuckCall() {

        quackObservable = new QuackObservableImpl(this);

    }

    @Override
    public void quack() {


        System.out.println("Kwak!!!");

        notifyObservers();

    }

    @Override
    public void registerObserver(QuackObserver quackObserver) {

        quackObservable.registerObserver(quackObserver);
        
    }

    @Override
    public void notifyObservers() {

        quackObservable.notifyObservers();
        
    }

    @Override
    public String toString() {

        return "Duck Call";

    }

}
