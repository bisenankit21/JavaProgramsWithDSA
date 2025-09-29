package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamGroupingByDemo {
    public static void main(String[] args) {
        List<Product> productList= Arrays.asList(new Product("Apple", 1200),
                new Product("Orange", 1500),
                new Product("Mango", 400),
                new Product("Banana", 600),
                new Product("Pineapple", 1000),
                new Product("Watermelon", 2000));

        Map<Long, List<Product>> groupByPrice = productList.stream().collect(Collectors.groupingBy(product -> product.getPrice()));
        System.out.println(groupByPrice);
    }
}
