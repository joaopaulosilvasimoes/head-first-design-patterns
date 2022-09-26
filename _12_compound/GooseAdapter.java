package _12_compound;

public class GooseAdapter implements Quackable {

    Goose goose;

    public GooseAdapter(Goose goose) {

        this.goose = goose;

    }

    @Override
    public void quack() {

        goose.honk();        
        
    }

    @Override
    public void registerObserver(QuackObserver quackObserver) {

        throw new UnsupportedOperationException();
        
    }

    @Override
    public void notifyObservers() {

        throw new UnsupportedOperationException();
        
    }
    
}
