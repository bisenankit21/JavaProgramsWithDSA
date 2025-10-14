package multithreading;

public class SumOfIntsThreadDemo
{
    public static void main(String[] args) throws InterruptedException {
        long startTime = System.currentTimeMillis();
        long result = 0;
        SomeThread thread1 = new SomeThread(0,Integer.MAX_VALUE/2);
        SomeThread thread2 = new SomeThread(Integer.MAX_VALUE/2+1,Integer.MAX_VALUE);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        result = thread1.getResult() + thread2.getResult();
        System.out.println(result);

        long endTime = System.currentTimeMillis();
        System.out.println("Time taken by multiple thread java class: "+(endTime-startTime));
    }

}
