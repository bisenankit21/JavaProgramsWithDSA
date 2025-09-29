package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamPartitioningByDemo {
    public static void main(String[] args) {
        List<Product> productList= Arrays.asList(new Product("Apple", 1200),
                new Product("Orange", 1500),
                new Product("Mango", 400),
                new Product("Banana", 600),
                new Product("Pineapple", 1000),
                new Product("Watermelon", 2000));

        Map<Boolean, List<Product>> partitionByPrice = productList.stream().collect(Collectors.partitioningBy(product -> product.getPrice()>1000));
        System.out.println(partitionByPrice);
    }
}
