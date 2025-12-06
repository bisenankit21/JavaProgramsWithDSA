package student;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ListOfStudent {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(new Student(1, "Manish"),
                new Student(2, "Rahul"),
                new Student(3, "Yogesh"),
                new Student(4, "Ankit"));
        students.stream().sorted(Comparator.comparing(Student::getName)).forEach(s->System.out.println("id: "+ s.getId() + "name: "+ s.getName()));
        //List<Student> studentList = students.stream().sorted(Comparator.comparing(s -> s.getName())).toList();
        // System.out.println(studentList);
    }
}
