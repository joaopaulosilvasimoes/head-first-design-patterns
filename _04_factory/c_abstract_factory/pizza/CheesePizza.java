package _04_factory.c_abstract_factory.pizza;

public class CheesePizza extends Pizza {
    
    PizzaIngredientFactory ingredientFactory;

    public CheesePizza(PizzaIngredientFactory pizzaIngredientFactory){

        this.ingredientFactory = pizzaIngredientFactory;

    }

    @Override
    public void prepare() {

        //
        dough = ingredientFactory.createDough();

        sauce = ingredientFactory.createSauce();

        cheese = ingredientFactory.createCheese();

        veggies = ingredientFactory.createVeggies();

        //
        System.out.println("Preparing - " + name);

        System.out.println("Tossing dough - " + dough.getDescription());
        
        System.out.println("Adding sauce - " + sauce.getDescription());

        System.out.println("Adding cheese - " + cheese.getDescription());        
        
        System.out.println("Adding veggies:" );
        
        for (Veggie veggie: veggies){

            System.out.println("    - Veggie: " + veggie.getDescription());
        
        }        
        
    }

}
