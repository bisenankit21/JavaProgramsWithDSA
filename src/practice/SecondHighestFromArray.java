package practice;

import java.util.Arrays;

public class SecondHighestFromArray {
    public static void main(String[] args) {
        int[] intArr = {4,2,3,6,7,9};
        int secondHighest = secondHighest(intArr);
        System.out.println(secondHighest);
    }

    private static int secondHighest(int[] intArr) {
        int highest=Integer.MIN_VALUE;
        int secondHighest=Integer.MIN_VALUE;
        Arrays.sort(intArr);
        System.out.println(Arrays.toString(intArr));
        for(int i=0;i<intArr.length;i++){
            if(intArr[i]>highest){
                secondHighest=highest;
                highest=intArr[i];
            } else if (intArr[i]<highest && intArr[i]>secondHighest) {
                secondHighest=intArr[i];
            }
        }
        return secondHighest;
    }

}
