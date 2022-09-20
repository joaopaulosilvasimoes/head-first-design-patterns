package _09_2_composite;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Iterator;

public class Menu extends MenuComponent {
    
    String name;
    String description;
    ArrayList<MenuComponent> menuComponents = new ArrayList<MenuComponent>();

    public Menu(String name, String description){

        this.name = name;
        this.description = description;

    }

    @Override
    public void add(MenuComponent menuComponent) {

        menuComponents.add(menuComponent);
    }
    
    @Override
    public void remove(MenuComponent menuComponent) {

        menuComponents.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i) {

        return menuComponents.get(i);
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
    public void print() {

        System.out.println(MessageFormat.format("\n{0}, {1}\n", getName(), getDescription()));
        System.out.println("------");

        Iterator<MenuComponent> iterator = menuComponents.iterator();

        while(iterator.hasNext()){

            MenuComponent menuComponent = iterator.next();

            menuComponent.print();

        }
   
    }

}
