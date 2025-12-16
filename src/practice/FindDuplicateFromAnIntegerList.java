package practice;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicateFromAnIntegerList {
    public static void main(String[] args) {
        List<Integer> numList = List.of(1, 4, 3, 6, 7, 5, 6, 8, 4, 3, 9, 7);
        List<Integer> duplicateList = findDuplicateFromAnIntegerList(numList);
        System.out.println(duplicateList);
    }

    private static List<Integer> findDuplicateFromAnIntegerList(List<Integer> numList) {
        Set<Integer> nonDuplicates = new HashSet<>();
       // numList.stream().filter(n-> !nonDuplicates.add(n)).forEach(System.out::println);
        List<Integer> result =  numList.stream().filter(n->!nonDuplicates.add(n)).toList();
        return result;
    }
}
