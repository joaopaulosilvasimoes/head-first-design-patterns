package _09_iterator_and_composite.java_implementation;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenu implements Menu {
 
    ArrayList<MenuItem> menuItems;

    public PancakeHouseMenu(){

        menuItems = new ArrayList<>();

        addItem("K&B's Pancake Breakfast", "Pancakes with scrambled eggs, and toast", true, 2.99);

        addItem("Rgular Pancake Breakfast", "Pancakes with fried eggs, sausage", false, 2.99);

        addItem("Blueberry Pancakes", "Pancakes made with fresh blueberries", true, 3.49);

        addItem("Waffles", "Waffes, with your choice of blueberries or strawberries", true, 3.49);

    }

    public void addItem(String name, String description, boolean vegetarian, double price){

        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);

        menuItems.add(menuItem);

    }

    /*
    public ArrayList<MenuItem> getMenuItems(){

        return menuItems;

    }
    */

    @Override
    public Iterator<MenuItem> createIterator() {

        return menuItems.iterator();

    }    

    @Override
    public String toString() {

        return "---BREAKFAST---";

    }

}