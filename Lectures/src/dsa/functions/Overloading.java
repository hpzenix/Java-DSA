package dsa.functions;

import java.util.Arrays;

public class Overloading {
    public static void main(String[] args) {
        fun(67);
        fun("thor");
//        demo();    // this  will give error due to ambiguity beacuse don't know which function to run
        demo(1, 2, 8,9);
        demo("shin", "chan", "rose");
    }

    static void fun(int a) {
        System.out.println(a);
    }

    static void fun(String a) {
        System.out.println(a);
    }


    static void demo(int ...v) {
        System.out.println(Arrays.toString(v));
    }

    static void demo(String ...v) {
        System.out.println(Arrays.toString(v));
    }



}
