package _04_factory.c_abstract_factory;

import _04_factory.c_abstract_factory.pizza.CheesePizza;
import _04_factory.c_abstract_factory.pizza.NYPizzaIngredientFactory;
import _04_factory.c_abstract_factory.pizza.Pizza;
import _04_factory.c_abstract_factory.pizza.PizzaIngredientFactory;

public class NYStylePizzaStore extends PizzaStore{

    @Override
    public Pizza createPizza(String item) {

        Pizza pizza = null;
        PizzaIngredientFactory nyPizzaIngredientFactory = new NYPizzaIngredientFactory();

        if (item.equals("cheese")){

            pizza = new CheesePizza(nyPizzaIngredientFactory);
            pizza.name = "NY Style Cheese Pizza";

        }
        // More pizzas.
          
        return pizza;

    }

}
