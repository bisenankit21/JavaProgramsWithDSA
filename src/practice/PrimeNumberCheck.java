package practice;


public class PrimeNumberCheck {

    public static void main(String[] args) {
        int num = 25;
        boolean result = isPrime(num);
        System.out.println(result);
    }

    private static boolean isPrime(int num) {
        if(num==1) {
            return false;
        }
        if(num==2){
            return true;
        }
        for(int i=3;i<=Math.sqrt(num);i+=2){
            if(num%i==0){
                return false;
            }
        }
     return true;
    }
}
