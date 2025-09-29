package streams;

import java.util.List;
import java.util.Optional;

public class StreamFindMatchOperationDemo {
    public static void main(String[] args) {
        List<Item> items = getItems();
        //Check if all the items are in stock
       boolean allInStock = items.stream().allMatch(Item::isInStock);
        System.out.println(allInStock);  //false

        //Check if any item is on sale
        boolean anyOnSale = items.stream().anyMatch(Item::isOnSale);
        System.out.println(anyOnSale);  //true

        //Check if any item is out of stock
        boolean anyOutOfStock = items.stream().anyMatch(item -> !item.isInStock());
        System.out.println(anyOutOfStock);  //true

        //Check if any item is costly
        boolean isAnyCostlyProduct = items.stream().noneMatch(item -> item.getPrice()>5000);
        System.out.println(isAnyCostlyProduct);  //true

        //Find the costly item
       Optional<Item> costlyItem = items.stream().filter(item->item.getPrice()>1000).findAny();
        System.out.println(costlyItem.get());

        //Find the costly item
        Optional<Item> costlyItem1 = items.stream().filter(item->item.getPrice()>1000).findFirst();
        System.out.println(costlyItem1.get());


    }
    private static List<Item> getItems() {
        return List.of(
                new Item("Laptop", 1200, true, false),
                new Item("Mobile", 1000, true, false),
                new Item("Keyboard", 100, false, true),
                new Item("Mouse", 50, true, false),
                new Item("Headphones", 200, true, false)
        );
    }
}
