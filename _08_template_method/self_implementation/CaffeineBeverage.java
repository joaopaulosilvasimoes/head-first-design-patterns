package _08_template_method.self_implementation;

public abstract class CaffeineBeverage {
    
    final void prepareRecipe(){

        boilWater();

        brew();

        pourInCup();

        if (customerWantsCondiments()){

            addCondiments();

        }

    }

    public abstract void brew();

    public abstract void addCondiments();

    public void boilWater(){

        System.out.println("Boiling water");

    }

    public void pourInCup(){

        System.out.println("Pouring into cup");

    }    

    // Hook Method
    public boolean customerWantsCondiments(){

        return true;

    }

}
