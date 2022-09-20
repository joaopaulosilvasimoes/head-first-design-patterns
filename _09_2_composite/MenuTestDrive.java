package _09_2_composite;

public class MenuTestDrive {
    
    public static void main(String[] args){

        MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");
        MenuComponent dinerMenu = new Menu("DINNER MENU", "Lunch");
        MenuComponent cafeMenu = new Menu("CAFÉ MENU", "Dinner");
        MenuComponent dessertMenu = new Menu("DESSERT MENU", "Dessert of Course!");

        MenuComponent mainMenu = new Menu("MAIN MENU", "All menus combined");

        mainMenu.add(pancakeHouseMenu);
        mainMenu.add(dinerMenu);
        mainMenu.add(cafeMenu);
        
        // Pancake House Menu.
        pancakeHouseMenu.add(new MenuItem("K&B's Pancake Breakfast", "Pancakes with scrambled eggs, and toast", true, 2.99));
        pancakeHouseMenu.add(new MenuItem("Regular Pancake Breakfast", "Pancakes with fried eggs, sausage", false, 2.99));
        pancakeHouseMenu.add(new MenuItem("Blueberry Pancakes", "Pancakes made with fresh blueberries", true, 3.49));
        pancakeHouseMenu.add(new MenuItem("Waffles", "Waffes, with your choice of blueberries or strawberries", true, 3.49));

        // Diner Menu.
        dinerMenu.add(new MenuItem("Vegetarian BLT", "(Fakin) Bacon with lettuce & tomato on whole wheat", true, 2.99));
        dinerMenu.add(new MenuItem("BLT", "Bacon with lettuce & tomato on whole wheat", false, 2.99));
        dinerMenu.add(new MenuItem("Soup of the day", "Soup of day, with a side of potato salad", false, 3.49));
        dinerMenu.add(new MenuItem("Hotdog", "A hot dog, with saurkraut, relish, onions, topped with cheese", false, 3.05));    

        //Dessert Menu.
        dinerMenu.add(dessertMenu);
        dessertMenu.add(new MenuItem("Apple Pie", "Apple pie with a flakey crust, topped with vanilla ice cream", true, 1.59));    
        
        //Cafe Menu.
        cafeMenu.add(new MenuItem("Veggie Burguer and Air Fries", "Veggie burguer on a whole wheat bun, lettuce, tomato, and fries", true, 3.99));
        cafeMenu.add(new MenuItem("Soup of the Day", "A cup of the soup of the day, with a side salada", false, 3.69));
        cafeMenu.add(new MenuItem("Burrito", "A large burrito, with whole pinto beans, salsa, guacamole", true, 4.29));

        //
        Waitress waitress = new Waitress(mainMenu);

        //
        waitress.printMenu();   

    }

}
