package Operators;

public class AssignmentOperatorDemo {
    public static void main(String[] args) {
        int num1, num2, num3, num4,num5;
        num1 = num2 = num3 = num4 = num5 = 10;

        double dNum1 = 3.14;
        double dNum2 = 4.12;
        dNum2 = dNum1;
        System.out.println(dNum2);
        dNum1 =6.1;
        System.out.println(dNum2);

        Person person1 = new Person("Ankit");
        Person person2 = new Person("Madan");
        person1 = person2;
        System.out.println(person1.name);
        person2.name = "Ram";
        System.out.println(person1.name);

        person1.name = "John";
        System.out.println(person2.name);
    }
}
