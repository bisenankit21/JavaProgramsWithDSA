package multithreading;

public class SharedBooleanResource {
    private volatile boolean stopFlage = false;

    public void setStopFlag(){
        stopFlage = true;
    }

    public void doWork(){
        while(!stopFlage){
            System.out.println("Working...");
        }
        System.out.println("Work completed");
    }
}
