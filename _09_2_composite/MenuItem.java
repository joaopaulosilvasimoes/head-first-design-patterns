package _09_2_composite;

import java.text.MessageFormat;
import java.util.Iterator;

public class MenuItem extends MenuComponent {

    String name;
    String description;
    boolean vegetarian;
    double price;

    public MenuItem(String name, String description, boolean vegetarian, double price){

        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;

    }

    @Override
    public String getName() {
     
        return name;
    
    }

    @Override
    public String getDescription() {
    
        return description;
    
    }

    @Override
    public boolean isVegetarian() {
     
        return vegetarian;
    
    }

    @Override
    public double getPrice() {
     
        return price;
    
    }

    @Override
    public void print() {

        System.out.println(MessageFormat.format("MENU ITEM: {0} - {1}: $ {2} \n --- {3}", getName(), (isVegetarian() ? "(V)" : "(NV)"), getPrice(), getDescription()));

    }
    
    @Override
    public Iterator<MenuComponent> createIterator() {

        return super.createIterator();

    }

}
