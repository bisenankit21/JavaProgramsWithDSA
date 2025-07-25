package exception;

public class ThrowsDemo {
    public static void main(String[] args) {
        Division division  = new Division();
        try{
            double output = division.divide("4","0");
            System.out.println(output);
        }
        catch (NumberFormatException | ArithmeticException ex){
            System.out.println("Invalid input");
        }

    }
}
