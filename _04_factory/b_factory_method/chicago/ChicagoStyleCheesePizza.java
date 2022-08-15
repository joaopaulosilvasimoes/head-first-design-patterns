package _04_factory.b_factory_method.chicago;

import _04_factory.b_factory_method.Pizza;

public class ChicagoStyleCheesePizza extends Pizza {
    

    public ChicagoStyleCheesePizza(){

        name = "Chicago Style - Cheese pizza";
        dough = "Extra Tick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");

    }

    @Override
    public void cut() {

        System.out.println("Cutting the pizza into square slices");

    }

}
