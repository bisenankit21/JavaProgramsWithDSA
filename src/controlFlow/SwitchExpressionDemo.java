package controlFlow;

public class SwitchExpressionDemo {
    public static void main(String[] args) {
        String fruitname = "Banana";
        switch (fruitname) {
            case "Banana", "Apple" -> System.out.println("Fruit is " + fruitname);
            case "Orange" -> System.out.println("Fruit is Orange");
            default -> System.out.println("Fruit is not found");
        }

        String fruitname1 = "Banana";
        String output = switch (fruitname1) {
            case "Banana", "Apple" -> "Fruit is " + fruitname1;
            case "Orange"-> "This fruit is Orange";
            case "Grapes" -> "This fruit is Grapes";
            default -> "Fruit is not found";
        };
        System.out.println(output);



        String day ="friday";
        int output1 = switch (day) {
            case "monday","friday", "sunday" ->{
                System.out.println(6);
                yield 6;
            }
            case "tuesday","wednesday","thursday" ->{
                System.out.println(5);
                yield 5;
            }
            case "saturday" -> {
                System.out.println(7);
                yield 7;
            }
            default -> {
                System.out.println(0);
                yield 0;
            }
        };
    }
}
