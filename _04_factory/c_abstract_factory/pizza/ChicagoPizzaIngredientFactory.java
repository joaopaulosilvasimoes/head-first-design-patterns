package _04_factory.c_abstract_factory.pizza;

import _04_factory.c_abstract_factory.pizza.cheese.MozzarellaCheese;
import _04_factory.c_abstract_factory.pizza.clam.FrozenClams;
import _04_factory.c_abstract_factory.pizza.dough.ThickCrustDough;
import _04_factory.c_abstract_factory.pizza.sauce.PlumTomatoSauce;
import _04_factory.c_abstract_factory.pizza.veggies.BlackOlives;
import _04_factory.c_abstract_factory.pizza.veggies.EggPlant;
import _04_factory.c_abstract_factory.pizza.veggies.Spinach;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {

        return new ThickCrustDough();

    }

    @Override
    public Sauce createSauce() {

        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {

        return new MozzarellaCheese();

    }

    @Override
    public Clam createClam() {

        return new FrozenClams();

    }

    @Override
    public Veggie[] createVeggies() {

        Veggie veggies[] = {new Spinach(), new EggPlant(), new BlackOlives()};

        return veggies;
    }
    
}
