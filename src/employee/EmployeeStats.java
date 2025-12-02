package employee;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.DoubleConsumer;
import java.util.stream.Collectors;

public class EmployeeStats {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "John", 25, "M", 40000.00),
                new Employee(2, "Jane", 30, "F", 50000.00),
                new Employee(3, "Bob", 35, "M", 60000.00),
                new Employee(4, "Alice", 40, "F", 70000.00),
                new Employee(5, "Charlie", 45, "M", 80000.00)
        );
        Map<String, Long> genderCount = employees.stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));

        System.out.println("Count by gender: " + genderCount);

        Map<String, Double> avgSalaryByGender = employees.stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(avgSalaryByGender);
    }
}
