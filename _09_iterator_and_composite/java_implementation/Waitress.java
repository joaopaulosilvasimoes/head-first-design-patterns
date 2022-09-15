package _09_iterator_and_composite.java_implementation;

import java.text.MessageFormat;
import java.util.Iterator;

public class Waitress {
    
    Menu pancakeHouseMenu;
    Menu dinerMenu;
    Menu cafeMenu;

    public Waitress(Menu pancakeHouseMenu, Menu dinerMenu, Menu cafeMenu){

        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
        this.cafeMenu = cafeMenu;

    }

    public void printMenu(){

        Iterator<MenuItem> pancakeHouseMenuIterator = pancakeHouseMenu.createIterator();
        Iterator<MenuItem> dinerMenuIterator = dinerMenu.createIterator(); 
        Iterator<MenuItem> cafeMenuIterator = cafeMenu.createIterator(); 

        System.out.println("\nMENU\n");

        System.out.println("\n---BREAKFAST---\n");
        printMenu(pancakeHouseMenuIterator);

        System.out.println("\n---LUNCH---\n");
        printMenu(dinerMenuIterator);

        System.out.println("\n---DINNER---\n");
        printMenu(cafeMenuIterator);        
        
    }

    public void printMenu(Iterator<MenuItem> iterator){

        while(iterator.hasNext()){

            MenuItem menuItem = iterator.next();

            System.out.println(MessageFormat.format("Item: {0}, {1} -- {2}", menuItem.getName(), menuItem.getPrice(), menuItem.getDescription()));

        }

    }

}
