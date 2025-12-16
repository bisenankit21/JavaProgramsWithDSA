package practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindEmployeeHavingMaximumSalary {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", 50000),
                new Employee("Bob", 70000),
                new Employee("Charlie", 60000)
        );

        Employee havingMaxSalary = employees.stream().max(Comparator.comparingDouble(Employee::getSalary)).get();
        System.out.println("Name : " + havingMaxSalary.getName() + " salary :" + havingMaxSalary.getSalary());


        Employee havingMaxSalaryApproach2 = employees.stream().reduce((e1, e2)->e1.getSalary() > e2.getSalary()?e1:e2).get();
        System.out.println("Name : " + havingMaxSalaryApproach2.getName() + " salary :" + havingMaxSalaryApproach2.getSalary());

    }

    public static class Employee {
        private String name;
        private double salary;
        public Employee(String name, double salary) {
            this.name = name;
            this.salary = salary;
        }

        public String getName() { return name; }
        public double getSalary() { return salary; }

    }
}


