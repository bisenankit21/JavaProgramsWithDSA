package practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FindYungestFemaleEmployee {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "Female", 28),
                new Employee("Bob", "Male", 32),
                new Employee("Clara", "Female", 24),
                new Employee("Diana", "Female", 30)
        );

        Employee yungestEmployee = employees.stream().filter(e->e.getGender()=="Female").reduce((e1,e2)->e1.getAge()<e2.getAge()?e1:e2).get();

        Employee yungestEmployee1 = employees.stream().filter(e->e.getGender()=="Female").min(Comparator.comparingInt(Employee::getAge)).get();
        System.out.println(yungestEmployee1.getName());

    }

    public static class Employee {
        private String name;
        private String gender;
        private int age;

        // constructor, getters
        public Employee(String name, String gender, int age) {
            this.name = name;
            this.gender = gender;
            this.age = age;
        }

        public String getName() { return name; }
        public String getGender() { return gender; }
        public int getAge() { return age; }
    }
}
