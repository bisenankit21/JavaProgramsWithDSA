package generics;

public class NonGenericCodeDemo {

    public static void main(String[] args) {
        Pair stringIntPair = new Pair("Ankit", 25);
        stringIntPair.setFirst(23);  //not throwing any error
        String myString = (String) stringIntPair.getFirst();  //Required Casting to String
        int myInt = (Integer) stringIntPair.getSecond();//Required Casting to Integer
        System.out.println(myString);
        System.out.println(myInt);
    }
}
