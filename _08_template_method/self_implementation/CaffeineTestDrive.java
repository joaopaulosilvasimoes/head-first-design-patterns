package _08_template_method.self_implementation;

public class CaffeineTestDrive {
    
    public static void main(String[] args){

        // Tea
        System.out.println("\nPreparing Tea...\n");

        Tea tea =  new Tea();

        tea.prepareRecipe();

        // Coffee
        System.out.println("\nPreparing Coffee...\n");

        Coffee coffee = new Coffee();

        coffee.prepareRecipe();

        // Coffee - Hook
        System.out.println("\nPreparing Coffee with Hook...\n");

        CoffeeWithHook coffeeWithHook = new CoffeeWithHook();

        coffeeWithHook.prepareRecipe();        

    }

}
