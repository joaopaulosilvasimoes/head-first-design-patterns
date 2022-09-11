package _08_template_method.self_implementation;

public class Coffee extends CaffeineBeverage {

    @Override
    public void brew() {

        System.out.println("Dripping coffee through filter");
        
    }

    @Override
    public void addCondiments() {

        System.out.println("Adding sugar and milk");
        
    }
    
}
