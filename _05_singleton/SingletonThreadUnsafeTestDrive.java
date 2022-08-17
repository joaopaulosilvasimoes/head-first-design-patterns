package _05_singleton;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingletonThreadUnsafeTestDrive {
    
    public static void main(String[] args){

        // 
        int threadCount = 5;

        ArrayList<Thread> threadList = new ArrayList<Thread>(); 

        //
        boolean showThreadName = false;

        // Start
        Singleton singleton = Singleton.getInstance();

        System.out.println("Start: " + singleton.getCount());

        // 
        for (int t = 0; t < threadCount; t++){

            // 
            Thread thread = new Thread() {

                @Override
                public void run() {

                    for (int i = 0; i < 10; i++){
                        
                        Singleton singleton = Singleton.getInstance(); 
                        
                        singleton.setCount(singleton.getCount() + 1);

                        int count = singleton.getCount();

                        System.out.println((showThreadName ? "Runnable #" + getName() + " - " : "") + count);

                    }
                
                }
                
            };

            //
            threadList.add(new Thread(thread, "Thread #" + t));

        } 

        //
        ExecutorService executor = Executors.newFixedThreadPool(threadCount);

        // 
        for(Thread thread : threadList){

            executor.execute(thread);

        }

        executor.shutdown();

    }

}
