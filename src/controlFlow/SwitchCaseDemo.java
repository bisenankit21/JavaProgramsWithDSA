package controlFlow;

public class SwitchCaseDemo {
    public static void main(String[] args) {
        String fruitname = "Banana";
        switch (fruitname){
            case "Apple":
                System.out.println("Fruit is Apple");
                break;
            case "Banana":
                System.out.println("Fruit is Banana");
                break;
            case "Orange":
                System.out.println("Fruit is Orange");
                break;
            default:
                System.out.println("Fruit is not found");
        }
    }
}
