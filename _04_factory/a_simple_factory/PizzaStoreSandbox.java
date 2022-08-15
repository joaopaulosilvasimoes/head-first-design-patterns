package _04_factory.a_simple_factory;

public class PizzaStoreSandbox {

    public static void main(String[] args){

        PizzaStore pizzaStore = new PizzaStore(new SimplePizzaFactory());

        pizzaStore.orderPizza("cheese");

        pizzaStore.orderPizza("clam");

    }
    
}
