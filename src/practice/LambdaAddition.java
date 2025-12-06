package practice;

public class LambdaAddition {
    public static void main(String[] args) {
        Addable addition = (a,b)->a*b;
        int result = addition.add(2,3);
        System.out.println(result);

    }
}
