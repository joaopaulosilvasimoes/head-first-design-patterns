package _07_2_facade.vendor_classes;

public class DvdPlayer {

    private String name;
    private int volume;
    private String movie;

    public DvdPlayer(String name){
    
        this.name = name;
        this.volume = 10;

    }

    public void turnOn() {
        
        System.out.println(String.format("The DVD player \"%s\" is ON", name));

    }

    public void turnOff() {

        System.out.println(String.format("The DVD player \"%s\" is OFF", name));
    
    }

    public void increaseVolume() {
   
        volume = volume++;

        System.out.println(String.format("The DVD player \"%s\" is VOLUME INCREASE", name));        
   
    }

    public void decreaseVolume() {
   
        volume = volume--;

        System.out.println(String.format("The DVD player \"%s\" is VOLUME DECREASE", name));          
   
    }    

    public void playMovie(String movie){

        this.movie = movie;

        System.out.println(String.format("The DVD player \"%s\" is playing: \"%s\"", name, this.movie));            

    }

    public void stopMovie(){

        System.out.println(String.format("The DVD player \"%s\" is stoping: \"%s\"", name, this.movie));            

    }    

    public void ejectMovie(){

        stopMovie();

        this.movie = null;

        System.out.println(String.format("The DVD player \"%s\" is ejecting", name));            

    }

    public String getName() {

        return name;
   
    }

    public int getVolume() {
    
        return volume;
    
    }

    public String getMovie() {
        return movie;
    }

}
