package _04_factory.c_abstract_factory;

import _04_factory.c_abstract_factory.pizza.Pizza;

public class PizzaStoreTestDrive {

    public static void main(String[] args){

        // NYC
        PizzaStore nyPizzaStore = new NYStylePizzaStore();

        // CHICAGO
        PizzaStore chicagoPizzaStore = new ChicagoStylePizzaStore();

        //
        Pizza nyPizza = nyPizzaStore.orderPizza("cheese");

        System.out.println("Ethan ordered a " + nyPizza.name + "\n");


        //
        Pizza chicagoPizza = chicagoPizzaStore.orderPizza("cheese");

        System.out.println("Joel ordered a " + chicagoPizza.name + "\n");

    }
    
}
