package _12_compound;

import java.util.ArrayList;
import java.util.Iterator;

public class QuackObservableImpl implements QuackObservable {

    ArrayList<QuackObserver> observers = new ArrayList<QuackObserver>();
    QuackObservable duck;

    public QuackObservableImpl(QuackObservable duck) {

        this.duck = duck;

    }

    @Override
    public void registerObserver(QuackObserver quackObserver) {

        observers.add(quackObserver);
        
    }

    @Override
    public void notifyObservers() {

        Iterator<QuackObserver> iterator = observers.iterator();

        while (iterator.hasNext()) {

            QuackObserver quackObserver = iterator.next();

            quackObserver.update(duck);

        }
        
    }
    
}
