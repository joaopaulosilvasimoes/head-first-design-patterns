package _12_compound;

import java.util.ArrayList;
import java.util.Iterator;

public class DuckFlockComposite implements Quackable {
 
    ArrayList<Quackable> quackers = new ArrayList<Quackable>();

    public void add(Quackable quacker) {

        quackers.add(quacker);

    }

    @Override
    public void quack() {

        // Iterator
        Iterator<Quackable> iterator = quackers.iterator();

        while (iterator.hasNext()) {

            Quackable quacker = iterator.next();

            quacker.quack();

        }

    }

    @Override
    public void registerObserver(QuackObserver quackObserver) {

        // Iterator
        Iterator<Quackable> iterator = quackers.iterator();

        while (iterator.hasNext()) {

            iterator.next().registerObserver(quackObserver);

        }
        
    }

    @Override
    public void notifyObservers() {

        // Iterator
        Iterator<Quackable> iterator = quackers.iterator();

        while (iterator.hasNext()) {

            iterator.next().notifyObservers();

        }        

    }    

}
