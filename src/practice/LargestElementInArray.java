package practice;

import java.util.Arrays;

public class LargestElementInArray {
    public static void main(String[] args) {
        int[] arr = {5,6,3,4,8,9,4,3};
        int max = 0 ;
        for(int i = 0; i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println(max);

        System.out.println("-----Using Stream---------");
        int largest = Arrays.stream(arr).max().getAsInt();
        System.out.println(largest);
    }
}
