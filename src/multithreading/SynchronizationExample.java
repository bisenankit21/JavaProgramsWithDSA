package multithreading;

public class SynchronizationExample {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Runnable synchronizedTask = ()-> {
            for(int i=0;i<1000;i++) {
                counter.incrementSynchronized();
            }
        };

        Thread thread1 = new Thread(synchronizedTask);
        Thread thread2 = new Thread(synchronizedTask);
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
