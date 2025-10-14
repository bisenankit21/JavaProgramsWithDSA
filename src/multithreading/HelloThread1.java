package multithreading;

public class HelloThread1 implements Runnable{

    @Override
    public void run() {
        System.out.println("Hello from thread" + " Which implement runnable interface");
    }
}
