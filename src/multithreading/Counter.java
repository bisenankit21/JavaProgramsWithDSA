package multithreading;

public class Counter {
    private  int count = 0;

    public void incrementUnsynchronized() {
        count++;
    }

    public synchronized void incrementSynchronized() {
        count++;
        /*synchronized (Counter.class){
            count++;
        }*/
    }

    public int getCount() {
        return count;
    }
}
