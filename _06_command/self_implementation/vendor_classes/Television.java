package _06_command.self_implementation.vendor_classes;

public class Television {

    private String name;
    private int volume;

    public Television(String name){
    
        this.name = name;
        this.volume = 10;

    }

    public void turnOn() {
        
        System.out.println(String.format("The Televison \"%s\" is ON", name));

    }

    public void turnOff() {

        System.out.println(String.format("The Television \"%s\" is OFF", name));
    
    }

    public void increaseVolume() {
   
        volume = volume++;

        System.out.println(String.format("The Televison \"%s\" is VOLUME INCREASE", name));        
   
    }

    public void decreaseVolume() {
   
        volume = volume--;

        System.out.println(String.format("The Televison \"%s\" is VOLUME DECREASE", name));          
   
    }    

    public String getName() {

        return name;
   
    }

    public int getVolume() {
    
        return volume;
    
    }

}
