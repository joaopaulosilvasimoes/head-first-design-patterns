package _07_2_facade.vendor_classes;

public class SmartLight {

    private String name;

    public SmartLight(String name){
    
        this.name = name;

    }

    public void on() {
        
        System.out.println(String.format("The Smart Light \"%s\" is ON", name));

    }

    public void off() {

        System.out.println(String.format("The Smart Light \"%s\" is OFF", name));
    
    }

    public String getName() {

        return name;
   
    }

}
