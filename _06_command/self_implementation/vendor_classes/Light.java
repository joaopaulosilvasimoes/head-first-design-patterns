package _06_command.self_implementation.vendor_classes;

public class Light {

    private String name;

    public Light(String name){
    
        this.name = name;

    }

    public void on() {
        
        System.out.println(String.format("The Light \"%s\" is ON", name));

    }

    public void off() {

        System.out.println(String.format("The Light \"%s\" is OFF", name));
    
    }

    public String getName() {

        return name;
   
    }

}
