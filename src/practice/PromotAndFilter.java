package practice;

import java.util.*;
import java.util.stream.Collectors;

class Student {
    int standard;
    String name;

    public Student(String name, int standard) {
        this.name = name;
        this.standard = standard;
    }

    @Override
    public String toString() {
        return name + " - " + standard;
    }
}

/*
Ques: class practice.Student { int standard;   String name} List<practice.Student>
standard 1 to 12 promote all students to next standard and filter students in the new list which are from standard 8 to 12 Ram- 1, Shyam-2, Rohan-3, Sohan-4, Mohan-4, Leela-5,Suresh-7 AFTER PROMOTION: Ram-2, Shyam-3, Rohan-4, Sohan-5, Mohan-5, Leela-6, Suresh-8
*/

public class PromotAndFilter {
    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("Ram", 1),
                new Student("Shyam", 2),
                new Student("Rohan", 3),
                new Student("Sohan", 4),
                new Student("Mohan", 4),
                new Student("Leela", 5),
                new Student("Suresh", 7)
        );

        List<Student> promotedAndFiltered = students.stream()
                .map(s -> new Student(s.name, s.standard + 1)) // promote
                .filter(s -> s.standard >= 8 && s.standard <= 12) // filter
                .collect(Collectors.toList());

        promotedAndFiltered.forEach(System.out::println);
    }
}