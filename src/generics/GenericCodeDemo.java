package generics;

public class GenericCodeDemo {
    public static void main(String[] args) {
        GenericPair<String, Integer> stringIntPair = new GenericPair<>("Ankit", 25);
        stringIntPair.setFirst("asasas");
        stringIntPair.setSecond(23);
        String myString = stringIntPair.getFirst();  //Required Casting to String
        int myInt = stringIntPair.getSecond();//Required Casting to Integer
        System.out.println(myString);
        System.out.println(myInt);
    }
}
