package _04_factory.c_abstract_factory;

import _04_factory.c_abstract_factory.pizza.CheesePizza;
import _04_factory.c_abstract_factory.pizza.ChicagoPizzaIngredientFactory;
import _04_factory.c_abstract_factory.pizza.Pizza;
import _04_factory.c_abstract_factory.pizza.PizzaIngredientFactory;

public class ChicagoStylePizzaStore extends PizzaStore{

    @Override
    public Pizza createPizza(String item) {

        Pizza pizza = null;
        PizzaIngredientFactory chicagoPizzaIngredientFactory = new ChicagoPizzaIngredientFactory();

        if (item.equals("cheese")){

            pizza = new CheesePizza(chicagoPizzaIngredientFactory);
            pizza.name = "Chicago Style Cheese Pizza";
            
        }
        // More pizzas.
          
        return pizza;

    }

}
