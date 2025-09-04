package list;

import java.util.ArrayList;
import java.util.Collections;

public class StudentSortingDemo {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>(); //create an arraylist of type student
        students.add(new Student("Alice", 20, 89));
        students.add(new Student("Charlie", 21, 92));
        students.add(new Student("Frank", 20, 88));
        students.add(new Student("David", 19, 85));
        students.add(new Student("Eve", 23, 75));
        students.add(new Student("Bob", 22, 78));
        System.out.println(students);
        Collections.sort(students);
        System.out.println(students);



        ArrayList<Student> students1 = new ArrayList<Student>(); //create an arraylist of type student
        students1.add(new Student("Alice", 20, 89));
        students1.add(new Student("Charlie", 21, 92));
        students1.add(new Student("Frank", 20, 88));
        students1.add(new Student("David", 19, 85));
        students1.add(new Student("Eve", 23, 75));
        students1.add(new Student("Bob", 22, 78));
        Collections.sort(students1, new StudentComprator());
        students1.sort(new StudentComprator());
        System.out.println(students1);

    }
}
