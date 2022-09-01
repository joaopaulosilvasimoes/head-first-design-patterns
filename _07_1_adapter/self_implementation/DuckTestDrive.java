package _07_1_adapter.self_implementation;

public class DuckTestDrive {

    public static void main(String[] args){

        //
        MallardDuck mallardDuck = new MallardDuck();

        //
        WildTurkey wildTurkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(wildTurkey);

        //
        System.out.println("The Turkey Says...");
        wildTurkey.gobble();
        wildTurkey.fly();

        //
        System.out.println("The Ducks Says...");
        testDuck(mallardDuck);

        //
        System.out.println("The TurkeyAdapter Says...");
        testDuck(turkeyAdapter);

    }
    
    static void testDuck(Duck duck){

        duck.quack();

        duck.fly();

    }

    
}
