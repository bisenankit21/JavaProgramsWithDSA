package multithreading;

public class DeadLoackDemo
{
    public static final String R1 = "hello";
    public static final String R2 = "world";

    public static void main(String[] args) {
        Thread thread1 = new Thread(()->
        {
            synchronized (R1) {
                System.out.println("Thread T1 Locked Resource R1");
                synchronized (R2) {
                    System.out.println("Thread T1 Locked Resource R2");
                }
            }
        });

        Thread thread2 = new Thread(()->
        {
            synchronized (R2) {
                System.out.println("Thread T2 Locked Resource R2");
                synchronized (R1) {
                    System.out.println("Thread T2 Locked Resource R1");
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}
