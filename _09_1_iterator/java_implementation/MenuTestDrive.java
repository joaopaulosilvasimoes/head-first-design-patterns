package _09_iterator_and_composite.java_implementation;

import java.util.ArrayList;

public class MenuTestDrive {
    
    public static void main(String[] args){

        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        CafeMenu cafeMenu = new CafeMenu();

        Waitress waitress = new Waitress(new ArrayList<Menu>(){{add(pancakeHouseMenu); add(dinerMenu); add(cafeMenu);}});

        //
        waitress.printMenu();   

    }

}
