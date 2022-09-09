package _08_template_method;

public class Tea extends CaffeineBeverage {

    @Override
    public void brew() {

        System.out.println("Steepin the tea");
        
    }

    @Override
    public void addCondiments() {

        System.out.println("Adding lemon");
        
    }
     
}
