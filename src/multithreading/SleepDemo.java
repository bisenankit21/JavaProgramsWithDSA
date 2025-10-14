package multithreading;

public class SleepDemo {
    public static void main(String[] args) throws InterruptedException {
        long startTime = System.currentTimeMillis();
        for(int i=1;i<=10;i++) {
            System.out.println("Hello from mian method "+ i);
            Thread.sleep(1000);
        }

        long endTime = System.currentTimeMillis();
        System.out.println("Time taken by main method: "+(endTime-startTime));
    }

}
