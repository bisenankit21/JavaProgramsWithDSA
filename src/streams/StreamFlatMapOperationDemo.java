package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFlatMapOperationDemo {
    public static void main(String[] args) {
        String[] arrayOfWords={"Ankit","Bisen","Kumar"};

        Stream<String> streamOfWords = Arrays.stream(arrayOfWords);
        Stream<String[]>streamOfelements= streamOfWords.map(word->word.split(""));
        streamOfelements.flatMap(Arrays::stream).forEach(System.out::println);


        List<Person> persons = Arrays.asList(new Person("Ankit",Arrays.asList("123", "456")),
                new Person("Bisen",Arrays.asList("789", "1011")));

        List<List<String>> phoneNumbers = persons.stream().map(person -> person.getPhoneNumbers()).collect(Collectors.toList());
        System.out.println(phoneNumbers);


        List<String> flatMapResult = persons.stream().flatMap(person -> person.getPhoneNumbers().stream()).collect(Collectors.toList());
        System.out.println(flatMapResult);

    }
}
