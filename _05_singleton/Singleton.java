package _05_singleton;

public class Singleton {

    private static Singleton uniqueInstance;

    private int count;

    private Singleton(){

    }

    public static Singleton getInstance(){

        if (uniqueInstance == null){

            uniqueInstance = new Singleton();

        }

        return uniqueInstance;

    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

}
