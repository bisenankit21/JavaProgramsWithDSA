package interview;

import java.util.Arrays;
import java.util.List;

public class SecondLargestFromArray {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4,6,1,3,88,9,45);
        int largest= 0;
        int secondLargest = 0;
        for(int num : nums){
            if(largest<num){
                secondLargest=largest;
                largest = num;
            } else if (secondLargest<num) {
                secondLargest=num;
            }
        }
        System.out.println(secondLargest);
    }
}
