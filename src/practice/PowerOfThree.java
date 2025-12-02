package practice;

public class PowerOfThree {
    public static void main(String[] args) {
        int num = 27;
        boolean isPowerOfThree = checkPowerOfThree(num);
        System.out.println(isPowerOfThree);
    }
    public static boolean checkPowerOfThree(int num) {
        if(num<=0){
            return false;
        }
        while(num%3==0){
            num=num/3;
        }
        return num==1;
    }
}
