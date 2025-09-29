package lambda;

public class LambdaExpressionDemo {
    public static void main(String[] args) {
        Hello hello =()->System.out.println("Hello");
        Hello hello1 =()->System.out.println("Hello Ankit");
        process(hello);
        process(hello1);

        ArithmatoicOperation addition = (a, b)->a+b;
        System.out.println(addition.operation(10, 20));
        ArithmatoicOperation subtraction = (a, b)->a-b;
        System.out.println(subtraction.operation(10, 20));
        ArithmatoicOperation Multiplication = (a, b)->a*b;
        System.out.println(Multiplication.operation(10, 20));
        ArithmatoicOperation division = (a, b)->a/b;
        System.out.println(division.operation(10, 20));
    }

    public static void process(Hello h){
        h.sayHello();
    }
}
