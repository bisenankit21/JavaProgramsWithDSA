package optional;

import java.util.Optional;
import java.util.Random;

public class OptionalDemo {
    public static void main(String[] args) {
        String message =  sayHello();
        System.out.println(message.toUpperCase());


        Optional<String> optionalMsg =  sayHii();
        if(optionalMsg.isPresent()){
            System.out.println(optionalMsg.get().toUpperCase());
        }
    }
    public static String sayHello(){
        int num = new Random().nextInt();
        System.out.println(num);
        if(num%2==0) {
            return "Hello";
        }
        return null;
    }

    public static Optional<String> sayHii(){
        int num = new Random().nextInt();
        System.out.println(num);
        String msg =null;
        if(num%2==0) {

            msg ="Hii";
        }
        return Optional.ofNullable(msg);
    }

}
