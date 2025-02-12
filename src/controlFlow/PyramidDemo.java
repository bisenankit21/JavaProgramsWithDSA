package controlFlow;

public class PyramidDemo {

    public static void main(String[] args) {
        int rows =5;
        for(int i=1;i<=rows;i++) {
            for(int j =1;j<=i;j++) {
                System.out.print("*");   //we should not use println as it will print in new line
            }
            System.out.println();
        }
    }
}
