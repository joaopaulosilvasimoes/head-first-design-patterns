package _09_1_iterator.self_implementation;

import java.text.MessageFormat;
import java.util.ArrayList;

public class Waitress {
    
    PancakeHouseMenu pancakeHouseMenu;
    DinerMenu dinerMenu;

    public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu){

        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;

    }

    public void printMenuVersion1(){

        ArrayList<MenuItem> breakfastItens = pancakeHouseMenu.getMenuItems();
        MenuItem[] lunchItens = dinerMenu.getMenuItems();

        System.out.println("\nMENU - VERSION 1\n");

        System.out.println("\n---BREAKFAST---\n");

        for (int i = 0; i < breakfastItens.size(); i++) {
            
            MenuItem menuItem = breakfastItens.get(i);

            if (menuItem != null){

                System.out.println(MessageFormat.format("Item: {0}, {1} -- {2}", menuItem.getName(), menuItem.getPrice(), menuItem.getDescription()));
   
            }
        }

        System.out.println("\n---LUNCH---\n");

        for (int i = 0; i < lunchItens.length; i++) {
            
            MenuItem menuItem = lunchItens[i];

            if (menuItem != null){

                System.out.println(MessageFormat.format("Item: {0}, {1} -- {2}", menuItem.getName(), menuItem.getPrice(), menuItem.getDescription()));

            }
        }
        
    }

    public void printMenuVersion2(){

        Iterator pancakeHouseMenuIterator = pancakeHouseMenu.createIterator();
        Iterator dinerMenuIterator = dinerMenu.createIterator(); 

        System.out.println("\nMENU - VERSION 2\n");

        System.out.println("\n---BREAKFAST---\n");
        printMenu(pancakeHouseMenuIterator);

        System.out.println("\n---LUNCH---\n");
        printMenu(dinerMenuIterator);
        
    }

    public void printMenu(Iterator iterator){

        while(iterator.hasNext()){

            MenuItem menuItem = (MenuItem) iterator.next();

            System.out.println(MessageFormat.format("Item: {0}, {1} -- {2}", menuItem.getName(), menuItem.getPrice(), menuItem.getDescription()));

        }

    }

}
