package generics;

import java.util.ArrayList;

public class WithoutGenericsDemo {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();  //we can store here any type of object: without generics we can store only object
        list.add("hello");
        list.add(123);
        list.add(true);
        System.out.println(list);

        String greeting = (String) list.get(0);
        Integer number = (Integer) list.get(1);
        Boolean flag = (Boolean) list.get(2);

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("hello");

        String greeting1 = list1.get(0);
    }
}
