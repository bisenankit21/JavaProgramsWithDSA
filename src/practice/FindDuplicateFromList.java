package practice;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicateFromList {
    public static void main(String[] args) {
        List<Integer> numList = List.of(1, 4, 3, 6, 7, 5, 6, 8, 4, 3, 9, 7);
        List<Integer> duplicateList = findDuplicateFromList(numList);
        System.out.println(duplicateList);
    }

    private static List<Integer> findDuplicateFromList(List<Integer> numList) {
        Set<Integer> seen = new HashSet<>();
        List<Integer> duplicateElements = numList.stream().filter(n->!seen.add(n)).distinct().toList();
        return duplicateElements;
    }
}
