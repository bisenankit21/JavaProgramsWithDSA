package Wrrapper;

import java.awt.*;

/*
Integer, Byte, Short and Long
* */
public class WrapperObjectsCaching {
    public static void main(String[] args) {
        Integer obj1 = 16;
        Integer obj2 = 16;
        System.out.println(obj1==obj2);
        Integer obj3 = 161;
        Integer obj4 = 161;
        System.out.println(obj3==obj4);


        Integer obj5 = new Integer(16);
        Integer obj6 = new Integer(16);
        System.out.println(obj5==obj6);
    }
}
