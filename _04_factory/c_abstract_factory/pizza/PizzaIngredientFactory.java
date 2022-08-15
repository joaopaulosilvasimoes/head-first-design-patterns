package _04_factory.c_abstract_factory.pizza;

public interface PizzaIngredientFactory {
 
    public Dough createDough();
    
    public Sauce createSauce();
    
    public Cheese createCheese();

    public Clam createClam();

    public Veggie[] createVeggies();

}
