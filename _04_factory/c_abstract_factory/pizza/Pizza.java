package _04_factory.c_abstract_factory.pizza;

public abstract class Pizza {
    
    public String name;
    public Dough dough;
    public Sauce sauce;
    public Cheese cheese;
    public Clam clam;
    public Veggie[] veggies;

    public abstract void prepare();

    public void bake(){

        System.out.println("Bake for 25 minutes at 350");

    }

    public void cut(){

        System.out.println("Cutting the pizza into diagonal slices");

    }

    public void box(){

        System.out.println("Place pizza in officional PizzaStore Box");

    }

}
