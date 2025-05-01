package string;

public class StringFormatDemo {
    public static void main(String[] args) {
        String message = "Hello, %s ! you have %d messages";
        String msgForMadan = String.format(message,"Madan", 10);
        String msgForSanvi = String.format(message,"Sanvi", 5);

        String message1 = "The price is $%.2f";
        String price = String.format(message1, 10.99);
        String price1 = String.format(message1, 20.99);


        String message2 = "The number is %5d";
        String number = String.format(message2, 10);
        String number1 = String.format(message2, 20);


        String message3 = "My name is %3$s, I am %2$d years old, I live in %1$s.";
        String result = String.format(message3, "Balaghat", 25 , "Ankit");
    }
}
