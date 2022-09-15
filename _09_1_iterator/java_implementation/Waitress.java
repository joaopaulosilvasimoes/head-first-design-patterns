package _09_iterator_and_composite.java_implementation;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Iterator;

public class Waitress {
    
    ArrayList<Menu> menus;

    public Waitress(ArrayList<Menu> menus){

        this.menus = menus;

    }

    public void printMenu(){

        Iterator<Menu> menuIterator = menus.iterator();
        
        while(menuIterator.hasNext()){

            Menu menu = menuIterator.next();

            System.out.println("\n" + menu.toString() + "\n");

            printMenu(menu.createIterator());

        }
        
    }

    public void printMenu(Iterator<MenuItem> iterator){

        while(iterator.hasNext()){

            MenuItem menuItem = iterator.next();

            System.out.println(MessageFormat.format("Item: {0}, {1} -- {2}", menuItem.getName(), menuItem.getPrice(), menuItem.getDescription()));

        }

    }

}
