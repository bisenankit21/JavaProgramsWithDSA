package multithreading;

public class JoinExample {
    public static void main(String[] args) throws InterruptedException {
        Thread  threadA = new Thread(
                ()-> {
                    for (int i = 1; i <= 5; i++) {
                        System.out.println("Thread A- count :" + i);
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
        );
        threadA.start();
        threadA.join();
        System.out.println("Main Thread ended");
    }
}
