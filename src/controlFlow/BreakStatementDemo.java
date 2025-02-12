package controlFlow;

public class BreakStatementDemo {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }


        int []arrayOfInt = {1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < arrayOfInt.length; i++) {
            if (arrayOfInt[i] == 5) {
                break;
            }
            System.out.println(arrayOfInt[i]);
        }

        outerForLoop:
        for (int i = 1; i <= 10; i++) {
            innerForLoop:
            for (int j = 1; j <= 10; j++) {
                if (j == 5) {
                    break outerForLoop;
                }
                System.out.println(i + " * " + j + " = " + (i * j));
            }
        }
    }
}
