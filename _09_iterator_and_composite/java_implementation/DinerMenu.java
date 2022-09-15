package _09_iterator_and_composite.java_implementation;

import java.util.Iterator;

public class DinerMenu implements Menu{
 
    static final int MAX_ITENS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu(){

        menuItems = new MenuItem[MAX_ITENS];

        addItem("Vegetarian BLT", "(Fakin) Bacon with lettuce & tomato on whole wheat", true, 2.99);

        addItem("BLT", "Bacon with lettuce & tomato on whole wheat", false, 2.99);

        addItem("Soup of the day", "Soup of day, with a side of potato salad", false, 3.49);

        addItem("Hotdog", "A hot dog, with saurkraut, relish, onions, topped with cheese", false, 3.05);

    }

    public void addItem(String name, String description, boolean vegetarian, double price){

        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);

        if (numberOfItems >= MAX_ITENS){

            System.err.println("Sorry, menu is full! Can't add item menu");

        } else {

            menuItems[numberOfItems] = menuItem;

            numberOfItems = numberOfItems + 1;

        }

    }

    /*
    public MenuItem[] getMenuItems(){

        return menuItems;

    }
    */

    public Iterator<MenuItem> createIterator() {

        return new DinerMenuIterator(menuItems);

    }

}