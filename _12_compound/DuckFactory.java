package _12_compound;

public class DuckFactory extends AbstractDuckFactory {

    @Override
    public Quackable createMallardDuck() {

        // Strategy and Decorator
        return new QuackCounterDecorator(new MallardDuck());

    }

    @Override
    public Quackable createRedheadDuck() {

        // Strategy and Decorator
        return new QuackCounterDecorator(new RedHeadDuck());

    }

    @Override
    public Quackable createDuckCall() {

        // Strategy and Decorator        
        return new QuackCounterDecorator(new DuckCall());

    }

    @Override
    public Quackable createRubberDuck() {

        // Strategy and Decorator        
        return new QuackCounterDecorator(new RubberDuck());

    }
    
}
