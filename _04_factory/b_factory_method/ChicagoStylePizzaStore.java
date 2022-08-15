package _04_factory.b_factory_method;

import _04_factory.b_factory_method.chicago.ChicagoStyleCheesePizza;
import _04_factory.b_factory_method.chicago.ChicagoStyleClamPizza;
import _04_factory.b_factory_method.chicago.ChicagoStylePepperoniPizza;
import _04_factory.b_factory_method.chicago.ChicagoStyleVeggiePizza;

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
