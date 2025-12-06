package practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ReverseStringArray {
    public static void main(String[] args) {
        String[] strname= {"A", "N", "K", "I","T"};
        int l = strname.length-1;
        int i=0;
        while(i<l){
            String temp = strname[l];
            strname[l] = strname[i];
            strname[i]=temp;
            i++;
            l--;
        }
        for(String s : strname){
            System.out.println(s);
        }
        System.out.println("-------------------");
        Arrays.stream(strname).sorted(Collections.reverseOrder()).forEach(s->System.out.println(s));
    }
}
