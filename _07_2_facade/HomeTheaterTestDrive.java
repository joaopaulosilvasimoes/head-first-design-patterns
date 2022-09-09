package _07_2_facade;

import _07_2_facade.vendor_classes.DvdPlayer;
import _07_2_facade.vendor_classes.SmartLight;
import _07_2_facade.vendor_classes.Television;

public class HomeTheaterTestDrive {
    
    public static void main(String[] args){

        //
        SmartLight smartLightRoom = new SmartLight("Room Light");
        Television televisionRoom = new Television("Room Television");
        DvdPlayer dvdPlayerRoom = new DvdPlayer("Room DVD Player");

        HomeTheaterFacade homeTheaterFacadeRoom = new HomeTheaterFacade(smartLightRoom, televisionRoom, dvdPlayerRoom);

        homeTheaterFacadeRoom.watchMovie("Raiders of the Lost Ark");
        homeTheaterFacadeRoom.endMovie();

        //
        SmartLight smartLightLivingRoom = new SmartLight("Living Room Light");
        Television televisionLivingRoom = new Television("Living Room Television");
        DvdPlayer dvdPlayerLivingRoom = new DvdPlayer("Living Room DVD Player");

        HomeTheaterFacade homeTheaterFacadeLivingRoom = new HomeTheaterFacade(smartLightLivingRoom, televisionLivingRoom, dvdPlayerLivingRoom);

        homeTheaterFacadeLivingRoom.watchMovie("Star Wars: Episode V - The Empire Strikes Back");
        homeTheaterFacadeLivingRoom.endMovie();

    }

}
