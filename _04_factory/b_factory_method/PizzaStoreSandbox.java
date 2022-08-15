package _04_factory.b_factory_method;

import _04_factory.b_factory_method.chicago.ChicagoStylePizzaStore;
import _04_factory.b_factory_method.nyc.NYStylePizzaStore;

public class PizzaStoreSandbox {

    public static void main(String[] args){

        // NYC
        PizzaStore nyPizzaStore = new NYStylePizzaStore();

        nyPizzaStore.orderPizza("cheese");

        nyPizzaStore.orderPizza("clam");

        // CHICAGO
        PizzaStore chicagoPizzaStore = new ChicagoStylePizzaStore();

        chicagoPizzaStore.orderPizza("cheese");

        chicagoPizzaStore.orderPizza("clam");

    }
    
}
