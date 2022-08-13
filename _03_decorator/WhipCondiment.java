package _03_decorator;

public class WhipCondiment extends CondimentDecorator {

    Beverage beverage;

    public WhipCondiment(Beverage beverage){

        this.beverage = beverage;

    }

    public String getDescription(){

        return beverage.getDescription() + ", Whip";

    }

    public double cost(){

        return beverage.cost() + .10;

    }
     
}
