package _03_decorator;

public class StarbuzzCoffe {

    public static void main(String[] args){

        // 
        Beverage espressoBeverage = new EspressoBeverage(); // 1.99

        System.out.println(espressoBeverage.getDescription() + " $ " + espressoBeverage.cost());

        //
        Beverage houseBlendBeverage = new HouseBlendBeverage(); // .89

        houseBlendBeverage = new SoyCondiment(houseBlendBeverage); // .15

        houseBlendBeverage = new MochaCondiment(houseBlendBeverage); // .20

        houseBlendBeverage = new WhipCondiment(houseBlendBeverage); // .10

        System.out.println(houseBlendBeverage.getDescription() + " $ " + houseBlendBeverage.cost());

    }
    
}
