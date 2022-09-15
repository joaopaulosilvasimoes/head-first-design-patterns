package _09_iterator_and_composite.java_implementation;

import java.util.Hashtable;
import java.util.Iterator;

public class CafeMenu implements Menu{
 
    Hashtable<String, MenuItem> menuItems;

    public CafeMenu(){

        menuItems = new Hashtable<String, MenuItem>();

        addItem("Veggie Burguer and Air Fries", "Veggie burguer on a whole wheat bun, lettuce, tomato, and fries", true, 3.99);

        addItem("Soup of the Day", "A cup of the soup of the day, with a side salada", false, 3.69);

        addItem("Burrito", "A large burrito, with whole pinto beans, salsa, guacamole", true, 4.29);

    }

    public void addItem(String name, String description, boolean vegetarian, double price){

        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);

        menuItems.put(menuItem.getName(), menuItem);

    }

    /* 
    public Hashtable<String, MenuItem> getMenuItems(){

        return menuItems;

    }
    */

    public Iterator<MenuItem> createIterator() {

        return menuItems.values().iterator();

    }

}