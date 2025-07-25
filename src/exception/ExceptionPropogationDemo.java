package exception;

public class ExceptionPropogationDemo {
    public static void main(String[] args) {
        method1();
        System.out.println("Main method");
    }
    static void method1(){
        try{
            method2();
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }


    }
    static void method2(){
        method3();
    }
    static void method3(){
        throw new NullPointerException("An null pointer exception occurred");
    }

}
