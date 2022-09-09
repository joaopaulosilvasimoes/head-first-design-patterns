package _07_2_facade;

import _07_2_facade.vendor_classes.Television;
import _07_2_facade.vendor_classes.DvdPlayer;
import _07_2_facade.vendor_classes.SmartLight;

public class HomeTheaterFacade {
    
    private SmartLight smartLight;
    private Television television;
    private DvdPlayer dvdPlayer;

    public HomeTheaterFacade(SmartLight smartLight, Television television, DvdPlayer dvdPlayer){
        
        this.smartLight = smartLight;

        this.television = television;

        this.dvdPlayer = dvdPlayer;

    }

    public SmartLight getSmartLight() {
    
        return smartLight;
    
    }

    public Television getTelevision() {
    
        return television;
    
    }

    public DvdPlayer getDvdPlayer() {
    
        return dvdPlayer;
    
    }

    // Simplified Interface
    public void watchMovie(String movie){

        System.out.println("\nGet ready to watch a movie...\n");

        smartLight.off();

        television.turnOn();
        television.increaseVolume();

        dvdPlayer.turnOn();
        dvdPlayer.playMovie(movie);
        dvdPlayer.increaseVolume();

    }

    // Simplified Interface
    public void endMovie(){

        System.out.println("\nShutting movie theater down...\n");
        
        smartLight.on();

        television.decreaseVolume();
        television.turnOff();

        dvdPlayer.decreaseVolume();
        dvdPlayer.ejectMovie();

    }

}
