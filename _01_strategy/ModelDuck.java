package _01_strategy;

import _01_strategy.fly.FlyNoWay;
import _01_strategy.quack.Quack;

public class ModelDuck extends Duck {
    
    public ModelDuck(){

        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();

    }

    public void display(){

        System.out.println("I'm a model duck!!");

    }

}
