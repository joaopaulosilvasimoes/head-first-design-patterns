package _04_factory.b_factory_method;

import java.util.ArrayList;

public abstract class Pizza {
    
    public String name;
    public String dough;
    public String sauce;
    public ArrayList<String> toppings = new ArrayList<String>();

    public Pizza(){

        name = "Generic pizza";
        dough = "Generic dough";
        sauce = "Generic sauce";
;
    }

    public void prepare(){

        System.out.println("Preparing - " + name);
        
        System.out.println("Tossing dough - " + dough);
        
        System.out.println("Adding sauce - " + sauce);
        
        System.out.println("Adding toppings:" );
        
        for (int i = 0; i < toppings.size(); i++){

            System.out.println("    Topping: " + toppings.get(i));
        
        }

    }

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
