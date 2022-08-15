package _04_factory.c_abstract_factory;

import _04_factory.c_abstract_factory.pizza.Pizza;

public abstract class PizzaStore {
    
    public Pizza orderPizza(String type){

        Pizza pizza;

        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;

    }

    // Factory Method.
    public abstract Pizza createPizza(String item);

}
