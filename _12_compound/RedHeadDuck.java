package _12_compound;

public class RedHeadDuck implements Quackable {

    QuackObservable quackObservable;

    public RedHeadDuck() {

        quackObservable = new QuackObservableImpl(this);

    }

    @Override
    public void quack() {


        System.out.println("Quack!!!");

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

        return "Red Head Duck";
        
    }    
    
}
