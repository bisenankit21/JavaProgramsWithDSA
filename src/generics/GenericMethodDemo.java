package generics;

public class GenericMethodDemo {
    public static void main(String[] args) {
        String[] stringsArray = {"hello", "world", "java"};
        printArray(stringsArray);
        Integer[] intArray = {1, 2, 3, 4, 5};
        printArray(intArray);
    }
    public static <T> void printArray(T[] arr){
        for (T element : arr) {
            System.out.println(element);
        }
    }
}
