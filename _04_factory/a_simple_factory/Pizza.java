package _04_factory.a_simple_factory;

public class Pizza {
    
    String name;

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
