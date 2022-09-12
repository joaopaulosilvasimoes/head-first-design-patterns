package _08_template_method.java_implementation;

import java.util.Arrays;

public class DuckSortTestDrive {
    
    public static void main(String[] args){

        Duck[] ducks = {
            new Duck("Daffy", 8),
            new Duck("Dewey", 2),
            new Duck("Howard", 7),
            new Duck("Louie", 2),
            new Duck("Donald", 10),
            new Duck("Huey", 2)
        };

        System.out.println("\nDucks Before Sorting...");
        displayDucks(ducks);

        // Implementation of Templete Method - compareTo()
        Arrays.sort(ducks);

        System.out.println("\nDucks After Sorting...");
        displayDucks(ducks);

    }

    public static void displayDucks(Duck[] duks){

        for (Duck duck : duks) {
            
            System.out.println(duck.toString());

        }

    }

}
