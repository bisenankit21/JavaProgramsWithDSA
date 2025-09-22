package set;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("India");
        treeSet.add("USA");
        treeSet.add("Sri Lanka");
        treeSet.add("Nepal");
        treeSet.add("Pakistan");
        System.out.println(treeSet);
        treeSet.remove("Nepal");
        System.out.println("TreeSet after Removal: "+ treeSet);
        System.out.println("TreeSet Size: "+ treeSet.size());
        System.out.println("is India Present in treeSet: "+ treeSet.contains("India"));
        System.out.println("First Elemenet of TreeSet: "+ treeSet.first());
        System.out.println("Last Elemenet of TreeSet: "+ treeSet.last());
    }
}
