package objectDemo;

public class GetClassDemo {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
       Person person1 = new Person();
        System.out.println(person1);
        Class prsnClass = person1.getClass();
        System.out.println(prsnClass.getName());
        System.out.println(prsnClass.getSimpleName());
        System.out.println(prsnClass.getPackageName());
    }
}
