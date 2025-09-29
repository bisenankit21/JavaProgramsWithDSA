package lambda;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        Function<String,String> convertStr = (input) -> input.toUpperCase();
        System.out.println(convertStr.apply("ankit"));

        Function<String,Integer> getStrLegth = (input) -> input.length();
        System.out.println(getStrLegth.apply("ankit"));


    }
}
