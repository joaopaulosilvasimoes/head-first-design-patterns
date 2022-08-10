package _01_strategy;

import _01_strategy.fly.FlyRocketPower;

public class MiniDuckSimulator {
 
    public static void main(String[] args){

        // Behavior from constructor.
        Duck mallard = new MallardDuck();

        mallard.performQuack();

        mallard.performFly();

        // Behavior from constructor and change in running time.
        Duck model = new ModelDuck();

        model.performFly();

        model.setFlyBehavior(new FlyRocketPower());

        model.performFly();

    }

}
