package methodreference;

public class StaticMethodReference {

    public static void main(String[] args) {
        ArithmaticOperation operation = (a,b)->{
            int sum =a+b;
            System.out.println(sum);
            return sum;
        };
        operation.performOperation(10,20);

        ArithmaticOperation methodReference = StaticMethodReference::performAddition;
        methodReference.performOperation(10,20);
    }

    public static int performAddition(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println(sum);
        return sum;
    }
}
