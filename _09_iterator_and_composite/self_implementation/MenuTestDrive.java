package _09_iterator_and_composite.self_implementation;

public class MenuTestDrive {
    
    public static void main(String[] args){

        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();

        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);

        // Code repeat.
        waitress.printMenuVersion1();

        // Using iterator.
        waitress.printMenuVersion2();        

    }

}
