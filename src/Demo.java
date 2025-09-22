import com.sun.jdi.connect.Connector;

import java.util.Arrays;

public class Demo {
    public static void main(String args[]){
        int[] nums =  {2, 7, 11, 15};
        int target = 9;
        int t1=0;
        int j=0;
        int[] result = new int[2];
        for(int i=1;i<nums.length;i++){
            if(nums[j]+nums[i]==target){
                result[0]=j;
                result[1]=i;
                break;
            }
            j++;
        }
        System.out.println(Arrays.toString(result));
        /*for(int i=0;i<nums.length;i++){
            for(int j=i+1; j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    result[0]=i;
                    result[1]=j;
                    break;
                }
            }
        }*/
    }
}
