package string;

public class SplitStringDemo {
    public static void main(String[] args) {
        String fruits = "apple,banana,orange,grape,kiwi,pineapple,watermelon";
        String[]  fruitsArray = fruits.split(",");
        System.out.println(fruitsArray);
    }
}
