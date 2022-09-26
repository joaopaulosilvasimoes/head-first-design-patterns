package _12_compound;

public class MallardDuck implements Quackable {

    QuackObservable quackObservable;

    public MallardDuck() {

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

        return "Mallard Duck";
        
    }    

}
