package _04_factory.c_abstract_factory.pizza;

import _04_factory.c_abstract_factory.pizza.cheese.ReggianoCheese;
import _04_factory.c_abstract_factory.pizza.clam.FreshClams;
import _04_factory.c_abstract_factory.pizza.dough.ThinCrustDough;
import _04_factory.c_abstract_factory.pizza.sauce.MarinaraSauce;
import _04_factory.c_abstract_factory.pizza.veggies.Garlic;
import _04_factory.c_abstract_factory.pizza.veggies.Mushroom;
import _04_factory.c_abstract_factory.pizza.veggies.Onion;
import _04_factory.c_abstract_factory.pizza.veggies.RedPepper;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {

        return new ThinCrustDough();

    }

    @Override
    public Sauce createSauce() {

        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {

        return new ReggianoCheese();

    }

    @Override
    public Clam createClam() {

        return new FreshClams();

    }

    @Override
    public Veggie[] createVeggies() {

        Veggie veggies[] = {new Garlic(), new Onion(), new Mushroom(), new RedPepper()};

        return veggies;
    }
    
}
