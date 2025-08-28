package Wrrapper;

public class AutoBoxingUnboxingDemo
{
    public static void main(String[] args){
        //Auto Boxing
        Integer integer = 16;
        Character character = 'A';
        Boolean booleanValue = true;

        //Unboxing
        int num = integer;
        char ch = character;
        boolean bool = booleanValue;

        System.out.println(num);
        System.out.println(ch);
        System.out.println(bool);

        Integer nullObj = null;
        int nullInt = nullObj;
    }
}
