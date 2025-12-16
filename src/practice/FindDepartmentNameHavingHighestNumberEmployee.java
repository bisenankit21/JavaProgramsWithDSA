package practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindDepartmentNameHavingHighestNumberEmployee {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "HR"),
                new Employee("Bob", "HR"),
                new Employee("Charlie", "IT"),
                new Employee("David", "IT"),
                new Employee("Eve", "IT"),
                new Employee("Frank", "Finance")
        );

        String departmentHavingHighestEmployee = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,
                Collectors.counting())).entrySet().stream().max(Map.Entry.comparingByValue()).map(Map.Entry::getKey).get();

        System.out.println(departmentHavingHighestEmployee);

    }

    public static  class Employee {
        private String name;
        private String department;

        // constructor, getters
        public Employee(String name, String department) {
            this.name = name;
            this.department = department;
        }

        public String getName() { return name; }
        public String getDepartment() { return department; }
    }
}
