package lambda;

public class AnonymousClassDemo {
    public static void main(String[] args) {
        Hello  hello = new Hello() {
            @Override
            public void sayHello() {
                System.out.println("Amonymous");
            }
        };

        process(hello);
        process(new Hello() {
            @Override
            public void sayHello() {
                System.out.println("Amonymous One");
            }
        });
    }

    public static void process(Hello h){
        h.sayHello();
    }
}
