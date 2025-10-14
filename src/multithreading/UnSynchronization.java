package multithreading;

public class UnSynchronization {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Runnable unSynchronizedTask = ()-> {
            for(int i=0;i<1000;i++) {
                counter.incrementUnsynchronized();
            }
        };

        Thread thread1 = new Thread(unSynchronizedTask);
        Thread thread2 = new Thread(unSynchronizedTask);
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(counter.getCount());
    }
}
