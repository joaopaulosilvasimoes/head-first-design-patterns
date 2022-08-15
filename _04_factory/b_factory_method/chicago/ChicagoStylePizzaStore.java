package _04_factory.b_factory_method.chicago;

import _04_factory.b_factory_method.Pizza;
import _04_factory.b_factory_method.PizzaStore;

public class ChicagoStylePizzaStore extends PizzaStore{

    @Override
    public Pizza createPizza(String type) {

        Pizza pizza = null;

        if (type.equals("cheese")){

            pizza = new ChicagoStyleCheesePizza();

        }
        else
        if (type.equals("pepperoni")){

            pizza = new ChicagoStylePepperoniPizza();

        }
        else
        if (type.equals("clam")){

            pizza = new ChicagoStyleClamPizza();

        }
        else
        if (type.equals("veggie")){

            pizza = new ChicagoStyleVeggiePizza();
            
        }

        return pizza;

    }

}