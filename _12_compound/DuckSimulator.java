package _12_compound;

public class DuckSimulator {

    public static void main(String[] args) {

        DuckSimulator duckSimulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new DuckFactory();

        duckSimulator.simulate(duckFactory);

    }

    void simulate(AbstractDuckFactory duckFactory) {

        // Observer
        Quackologist quackologist = new Quackologist();

        // Factory, Strategy, Decorator and Observer
        Quackable mallardDuck = duckFactory.createMallardDuck();
        mallardDuck.registerObserver(quackologist);
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        redheadDuck.registerObserver(quackologist);
        Quackable duckCall = duckFactory.createDuckCall();
        duckCall.registerObserver(quackologist);
        Quackable rubberDuck = duckFactory.createRubberDuck();
        rubberDuck.registerObserver(quackologist);

        // Adapter
        Quackable gooseDuck = new GooseAdapter(new Goose());

        // Composite
        DuckFlockComposite flockOfDucks = new DuckFlockComposite();

        // Observer
        flockOfDucks.registerObserver(quackologist);

        flockOfDucks.add(mallardDuck);
        flockOfDucks.add(redheadDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(rubberDuck);
        flockOfDucks.add(gooseDuck);

        Quackable mallardDuck1 = duckFactory.createMallardDuck();
        Quackable mallardDuck2 = duckFactory.createMallardDuck();
        Quackable mallardDuck3 = duckFactory.createMallardDuck();
        Quackable mallardDuck4 = duckFactory.createMallardDuck();

        // Composite
        DuckFlockComposite flockOfMallardsDucks = new DuckFlockComposite();

        flockOfMallardsDucks.add(mallardDuck1);
        flockOfMallardsDucks.add(mallardDuck2);
        flockOfMallardsDucks.add(mallardDuck3);
        flockOfMallardsDucks.add(mallardDuck4);

        System.out.println("\nDuck Simulator:\n");

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseDuck);

        // Observer
        flockOfMallardsDucks.registerObserver(quackologist);    

        System.out.println("\nDuck Simulator: Whole Flock Simulation\n");
      
        simulate(flockOfDucks);

        System.out.println("\nDuck Simulator: Mallard Flock Simulation\n");
      
        simulate(flockOfMallardsDucks);        

        System.out.println("\nThe  Ducks quacked: " + QuackCounterDecorator.getNumberOfQuacks() + " Times!!!");

    }

    void simulate(Quackable duck){

        duck.quack();

    }

}
