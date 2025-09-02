package list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ImmutableListDemo {
    public static void main(String[] args) {
        List<Integer> accountNums = new ArrayList<>();
        accountNums.add(123456);
        accountNums.add(9876543);
        accountNums.add(123456);
        accountNums.add(123456);
       // addTenDollars(accountNums);
        accountNums=Collections.unmodifiableList(accountNums);
        List<Integer> immutableList = List.of(1,2,3);  //we can create immutable list using this.
        addTenDollars(accountNums);

    }
    private static List<Integer> addTenDollars(List<Integer> accountNums) {
        accountNums.add(3434344);
        for (Integer account: accountNums) {
            System.out.println("Ten Dollar credited into the account: " + account);
        }
        return accountNums;
    }
}
