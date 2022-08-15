package _04_factory.b_factory_method;

public abstract class PizzaStore {
    
    public Pizza orderPizza(String type){

        Pizza pizza;

        pizza = createPizza(type);

        System.out.println("Ordering Pizza - " + pizza.name);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;

    }

    // Factory Method.
    public abstract Pizza createPizza(String type);

}
