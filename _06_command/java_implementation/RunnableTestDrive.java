package _06_command.java_implementation;

import java.text.MessageFormat;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunnableTestDrive {
    
    public static void main(String[] args){

        //
        int threadCount = 10;

        //
        Thread[] threadList = new Thread[threadCount];

        //
        for (int i = 0; i < threadList.length; i++) {

            threadList[i] = new Thread(new Runnable() {

                @Override
                public void run() {

                    for (int j = 0; j < 10; j++) {
                        
                        System.out.println(toString() + " - " + j);

                    }
                    
                }
                
            },
            "Thread #" + i);
            
        }

        //
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // 
        for(Thread thread : threadList){

            executor.execute(thread);

        }

        executor.shutdown();

    }

}
