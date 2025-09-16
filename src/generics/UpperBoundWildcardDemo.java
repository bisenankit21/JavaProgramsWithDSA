package generics;

import generics.model.Developer;
import generics.model.Employee;
import generics.model.Manager;

import java.util.ArrayList;
import java.util.List;

public class UpperBoundWildcardDemo {
    public static void main(String[] args) {
        List<Employee> employees1 = List.of(new Employee(), new Employee(), new Employee(), new Employee(), new Employee());
        printEmployeesNames(employees1);

        List<Developer> developers1 = List.of(new Developer(), new Developer(), new Developer(), new Developer(), new Developer());
        printEmployeesNames(developers1);

        List<Manager> managers1 = List.of(new Manager(), new Manager(), new Manager(), new Manager(), new Manager());
        printEmployeesNames(managers1);

    }
    public static void printEmployeesNames(List<? extends Employee> employees){
        for(Employee employee : employees){
            System.out.println(employee);
        }
    }
}
