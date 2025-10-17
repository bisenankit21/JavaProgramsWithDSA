package multithreading;

import java.util.Random;

public class VirtualThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        long startTime = System.currentTimeMillis();
        Random random = new Random();
        Runnable runnable = () -> {
            double result = random.nextDouble(1000)*random.nextDouble(1000);
            System.out.println(result);
        };
        for (int i = 0; i < 500000; i++) {
          //  Thread.startVirtualThread(runnable).join();
            Thread.ofVirtual().start(runnable);
           //Thread thread = new Thread(runnable);
           // thread.start();
            //thread.join();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken by main method: "+(endTime-startTime));
    }
}
