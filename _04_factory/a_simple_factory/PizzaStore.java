package _04_factory.a_simple_factory;

public class PizzaStore {

    SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory){

        this.factory = factory;

    }

    public Pizza orderPizza(String type){


        Pizza pizza;

        pizza = factory.createPizza(type);

        System.out.println("Ordering Pizza - " + pizza.name);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;

    }

}
