package _03_decorator;

public class StreamedMilkCondiment extends CondimentDecorator {

    Beverage beverage;

    public StreamedMilkCondiment(Beverage beverage){

        this.beverage = beverage;

    }

    public String getDescription(){

        return beverage.getDescription() + ", Streamed Milk";

    }

    public double cost(){

        return beverage.cost() + .10;

    }
     
}
