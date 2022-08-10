package _01_strategy;

import _01_strategy.fly.FlyWithWings;
import _01_strategy.quack.Quack;

public class MallardDuck extends Duck {
    
    public MallardDuck(){

        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();

    }

    public void display(){

        System.out.println("I'm a real Mallard Duck!!");

    }

}
