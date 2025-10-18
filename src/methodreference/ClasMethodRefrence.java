package methodreference;

import java.util.List;

public class ClasMethodRefrence {
    public static void main(String[] args) {
            var list = List.of("Supply", "HR", "IT", "Admin", "Sales", "Marketing");
            list.forEach(department->System.out.println(department));
            list.forEach(System.out::println);
    }
}
