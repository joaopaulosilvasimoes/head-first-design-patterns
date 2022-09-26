package _12_compound;

public class QuackCounterDecorator implements Quackable {

    Quackable duck;
    static int numberOfQuacks;

    public QuackCounterDecorator(Quackable duck) {

        this.duck = duck;

    }

    @Override
    public void quack() {

        duck.quack();
        numberOfQuacks++;
        
    }

    public static int getNumberOfQuacks() {
    
        return numberOfQuacks;
    
    }

    @Override
    public void registerObserver(QuackObserver quackObserver) {

        
    }

    @Override
    public void notifyObservers() {

        
    }
    
}
