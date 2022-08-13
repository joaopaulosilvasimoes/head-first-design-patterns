package _03_decorator;

public class SoyCondiment extends CondimentDecorator {

    Beverage beverage;

    public SoyCondiment(Beverage beverage){

        this.beverage = beverage;

    }

    public String getDescription(){

        return beverage.getDescription() + ", Soy";

    }

    public double cost(){

        return beverage.cost() + .15;

    }
     
}
