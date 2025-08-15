package objectDemo;

public class CloneDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person p1 = new Person("John", 10, 'M', 56565656);
        Person p2 = p1;   //here both just pointing to the same physical object inside the same memory location. This is called shallow copy
        p2.setName("Ram");
        System.out.println(p1.getName());  //Ram
        //to efficiently copy the object with all the data we need to use clone method
        //we need to override the clone method in the Person class
        Person p3 = (Person) p1.clone();  //using this whatever the data present in p1 will be copied into p3. This is called deep copy]
        System.out.println(p3.getName());
        p3.setName("Shyam");
        System.out.println(p1.getName());   //Ram
        System.out.println(p3.getName());  //Shyam


    }
}
