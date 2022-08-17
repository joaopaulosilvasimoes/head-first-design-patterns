package _05_singleton;

public class SingletonThreadSafe {

    private static  SingletonThreadSafe uniqueInstance;

    private int count;

    private SingletonThreadSafe(){

    }

    public static synchronized SingletonThreadSafe getInstance(){

        if (uniqueInstance == null){

            uniqueInstance = new SingletonThreadSafe();

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
