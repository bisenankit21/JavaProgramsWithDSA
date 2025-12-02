package practice;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {
    public static void main(String[] args) {
        List<Integer> result = selfDividingNumber(47, 85);
        System.out.println(result);
    }

    private static List<Integer> selfDividingNumber(int left, int right) {
        List<Integer> result = new ArrayList<>();
        for(int i=left;i<=right;i++){
            int q=i;
            boolean flag=true;
            while(q>0){
                int rem=q%10;
                q=q/10;
                if(rem==0 || i%rem!=0){
                    flag=false;
                    break;
                }
            }
            if(flag){
                result.add(i);
            }
        }
        return result;
    }
}
