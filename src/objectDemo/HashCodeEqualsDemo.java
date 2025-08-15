package objectDemo;

public class HashCodeEqualsDemo {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Person p1 = new Person("John", 10, 'M', 56565656);
        Person p2 = new Person("John", 10, 'M', 56565656);

        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p1.equals(p2));   //false

        if (p1.equals(p2)) {
            System.out.println("Objects are equal");
        }

        System.out.println(p1);
        System.out.println(p2);
    }
}