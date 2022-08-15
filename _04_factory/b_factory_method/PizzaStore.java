package _04_factory.b_factory_method;

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
    public abstract Pizza createPizza(String type);

}
