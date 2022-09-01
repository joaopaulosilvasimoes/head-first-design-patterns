package _07_1_adapter.self_implementation;

public class MallardDuck implements Duck {

    @Override
    public void quack() {

        System.out.println("Quack");
        
    }

    @Override
    public void fly() {

        System.out.println("I'm flying");

    }

}
