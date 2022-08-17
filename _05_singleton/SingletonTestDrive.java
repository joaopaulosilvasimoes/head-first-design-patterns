package _05_singleton;

public class SingletonTestDrive {
    
    public static void main(String[] args){

        // Object A
        Singleton objectA = Singleton.getInstance();

        System.out.println(objectA.getCount());

        objectA.setCount(objectA.getCount() + 1);

        System.out.println(objectA.getCount());

        // Object B
        Singleton objectB = Singleton.getInstance();

        System.out.println(objectB.getCount());

        objectB.setCount(objectB.getCount() + 1);

        System.out.println(objectB.getCount());

    }

}
