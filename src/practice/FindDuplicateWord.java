package practice;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateWord {
    public static void main(String[] args) {
        String[] dataStream = {
                "record1", "record2", "record3", "record1", "record4", "record2"
        };
        Set<String> nonDuplicate = new HashSet<>();
        Set<String> duplicate = new HashSet<>();
        for(String word : dataStream){
            if(!nonDuplicate.add(word)){
                duplicate.add(word);
            }
        }
        System.out.println(duplicate);
    }
}
