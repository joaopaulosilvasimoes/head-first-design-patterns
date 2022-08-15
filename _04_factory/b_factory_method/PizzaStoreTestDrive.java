package _04_factory.b_factory_method;

import _04_factory.b_factory_method.chicago.ChicagoStylePizzaStore;
import _04_factory.b_factory_method.nyc.NYStylePizzaStore;

public class PizzaStoreTestDrive {

    public static void main(String[] args){

        // NYC
        PizzaStore nyPizzaStore = new NYStylePizzaStore();

        // CHICAGO
        PizzaStore chicagoPizzaStore = new ChicagoStylePizzaStore();

        //
        Pizza nyPizza = nyPizzaStore.orderPizza("cheese");

        System.out.println("Ethan ordered a " + nyPizza.getName() + "\n");


        //
        Pizza chicagoPizza = chicagoPizzaStore.orderPizza("cheese");

        System.out.println("Joel ordered a " + chicagoPizza.getName() + "\n");

    }
    
}
