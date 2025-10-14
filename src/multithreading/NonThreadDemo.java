package multithreading;

public class NonThreadDemo {
    public static void main(String[] args) {
        for(int i=1;i<=100;i++) {
            System.out.println(i);
        }

        for(int i=100;i<=200;i++) {
            System.out.println(i);
        }
    }
}
