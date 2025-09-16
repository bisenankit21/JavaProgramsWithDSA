package generics;

import generics.model.Developer;
import generics.model.Employee;
import generics.model.Manager;

import java.util.ArrayList;
import java.util.List;

public class CovarianceDemo {
    public static void main(String[] args) {
        Employee[] employees = {new Employee(), new Employee()};
        printArray(employees);
        Developer[] developers = {new Developer(), new Developer()};
        printArray(developers);
        Manager[] managers = {new Manager(), new Manager()};
        printArray(managers);

        String s = "hello";
        Object o = s;

        String[] strings = {"hello", "world"};
        Object[] objects = strings;

        List<String> stringList = new ArrayList<>();
        //List<Object> objectList = stringList;

        Number[] numbers = {1,2,3,4,5,6,7,8,9,10};
        Object[] objects1 = numbers;  //Covariance accepting
        objects1[0] = "hello";   //will give compile time error as our compiler not able to detect it

        List<Employee> employees1 = List.of(new Employee(), new Employee(), new Employee(), new Employee(), new Employee());
        printArray1(employees1);

        List<Developer> developers1 = List.of(new Developer(), new Developer(), new Developer(), new Developer(), new Developer());
        // printArray1(developers1);   //Inside Collection Covariance not allowed
    }

    public static void printArray(Employee[] employees){
        for(Employee employee : employees){
            System.out.println(employee);
        }
    }

    public static void printArray1(List<Employee> employees){
        for(Employee employee : employees){
            System.out.println(employee);
        }
    }

}
