package methodreference;

public class ConstructorReferenceDemo {
    public static void main(String[] args) {
        ProductInterface productInterface = ((name, price) -> new Product(name, price));
        System.out.println(productInterface.getProduct("Pen", 10));


        ProductInterface construtorInterface = Product::new;
        System.out.println(productInterface.getProduct("Pen", 10));
    }
}
