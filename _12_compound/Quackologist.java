package _12_compound;

public class Quackologist implements QuackObserver {

    @Override
    public void update(QuackObservable duck) {

        System.out.println("Quackologist: " + duck + "just quacked.");
        
    }
    
}
