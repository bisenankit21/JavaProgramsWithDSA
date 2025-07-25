package exception;

import java.util.logging.Logger;

public class ArrayIndexOutOfBoundExceptionDemo {
    private static Logger logger = Logger.getLogger(ArrayIndexOutOfBoundExceptionDemo.class.getName());
    public static void main(String[] args) {
        try{
            int[] num = {1,2,3,4,5};
            System.out.println(num[5]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            logger.severe("Invalid Array index. Please try again with a valid index number");
            System.out.println("Invalid Array index. Please try again with a valid index number");
        }

    }
}
