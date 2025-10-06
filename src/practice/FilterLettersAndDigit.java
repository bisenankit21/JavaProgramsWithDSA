package practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterLettersAndDigit {
    public static void main(String[] args) {
        List<Character> characterList = Arrays.asList('a', '1', 'b', '2', 'c', '3');
        List<Character> alphabetList = characterList.stream().filter(Character::isAlphabetic).toList();
        List<Character> digitList = characterList.stream().filter(Character::isDigit).toList();
        System.out.println(alphabetList);
        System.out.println(digitList);
    }
}
