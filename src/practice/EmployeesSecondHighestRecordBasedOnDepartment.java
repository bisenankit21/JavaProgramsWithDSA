package practice;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeesSecondHighestRecordBasedOnDepartment {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "HR", 50000),
                new Employee("Bob", "HR", 70000),
                new Employee("Charlie", "HR", 60000),
                new Employee("David", "IT", 80000),
                new Employee("Eve", "IT", 90000),
                new Employee("Frank", "IT", 85000)
        );

        Map<String, Optional<Employee>> secondHighestByDept = employees.stream().
                collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.collectingAndThen(Collectors.toList(),
                                list -> list.stream()
                                        .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                                        .skip(1) // skip highest
                                        .findFirst() // get second highest
                        )
                ));

        secondHighestByDept.forEach((dept, emp) ->
                System.out.println("Dept: " + dept +
                        " -> Second Highest: " +
                        emp.map(Employee::getName).orElse("None") +
                        " (" + emp.map(Employee::getSalary).orElse(0.0) + ")")
        );

    }

    public static class Employee {
        private String name;
        private String department;
        private double salary;

        // constructor, getters
        public Employee(String name, String department, double salary) {
            this.name = name;
            this.department = department;
            this.salary = salary;
        }

        public String getName() {
            return name;
        }

        public String getDepartment() {
            return department;
        }

        public double getSalary() {
            return salary;
        }
    }
}
