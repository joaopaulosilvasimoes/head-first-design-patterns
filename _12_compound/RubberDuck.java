package _12_compound;

public class RubberDuck implements Quackable {

    QuackObservable quackObservable;

    public RubberDuck() {

        quackObservable = new QuackObservableImpl(this);

    }

    @Override
    public void quack() {


        System.out.println("Squeak!!!");

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

        return "Rubber Duck";
        
    }

}
