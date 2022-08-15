package _04_factory.b_factory_method;

public abstract class Pizza {
    
    public String name;

    public Pizza(){

        name = "Generic pizza";

    }

    public void prepare(){

        System.out.println("Preparing pizza!");;

    }

    public void bake(){

        System.out.println("Baking pizza!");

    }

    public void cut(){

        System.out.println("Cutting pizza!");

    }

    public void box(){

        System.out.println("Boxing pizza!");

    }

}
