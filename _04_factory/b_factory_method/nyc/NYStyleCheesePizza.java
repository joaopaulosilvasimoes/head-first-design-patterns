package _04_factory.b_factory_method.nyc;

import _04_factory.b_factory_method.Pizza;

public class NYStyleCheesePizza extends Pizza {
    

    public NYStyleCheesePizza(){

        name = "NY Style - Cheese pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");

    }

}
