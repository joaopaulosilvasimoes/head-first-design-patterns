package _03_decorator;

public class MochaCondiment extends CondimentDecorator {

    Beverage beverage;

    public MochaCondiment(Beverage beverage){

        this.beverage = beverage;

    }

    public String getDescription(){

        return beverage.getDescription() + ", Mocha";

    }

    public double cost(){

        return beverage.cost() + .20;

    }
     
}
