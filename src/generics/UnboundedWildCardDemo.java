package generics;

import java.util.Arrays;
import java.util.List;

public class UnboundedWildCardDemo {
    public static void main(String[] args) {
        List<Integer> li= Arrays.asList(1,2,3,4,5);
        List<String> ls= Arrays.asList("One","Two","Three","Four");
        printList(ls);
        printList(li);
    }
    public static void printList(List<?> list){
        for (Object o : list) {
            System.out.println(o);
        }
        System.out.println(list.size());
    }
}
