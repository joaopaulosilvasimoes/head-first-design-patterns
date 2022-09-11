package _08_template_method;

import java.util.Scanner;

public class CoffeeWithHook extends CaffeineBeverage{
    
    @Override
    public void brew() {

        System.out.println("Dripping coffee through filter");
        
    }

    @Override
    public void addCondiments() {

        System.out.println("Adding sugar and milk");
        
    }

    // Hook Method Implemented
    @Override
    public boolean customerWantsCondiments() {

        String answer = getUserInput();

        if (answer.startsWith("y")){
        
            return true;
        
        }
        else{
        
            return false;

        }

    }

    private String getUserInput(){

        String answer = null;

        System.out.println("\nWold you like milk and sugar with your coffe (y/n)?\n");

        Scanner scanner = new Scanner(System.in);

        answer = scanner.nextLine();

        return answer;

    }

}
