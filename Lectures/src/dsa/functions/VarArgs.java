package dsa.functions;
import  java.util.Arrays;

public class VarArgs {
    public static void main(String args[]) {
        fun(); // this will also work but will return empty array

        fun(1, 5, 6, 8, 9, 68, 98, 32, 54);  // can take any number of arguments
        // this will return an array of these integers because internally it will store it in array

        fun2("tony", "Stark", "thor", "2", "s");  // can take any number of arguments

        multiple(2, 3, 3, 5,57, 45);
    }

    static void fun(int ...v) {      // here we can use string or char or any other datatype
        System.out.println(Arrays.toString(v));
    }

    static void fun2(String ...v) {
        System.out.println(Arrays.toString(v));
    }

    // if we want to have mix of arguments
    static void multiple(int a, int b, int ...v) {
        System.out.println(Arrays.toString(v));
    }

//    static void multiple(int a, int ...v, int b)           NOT ALLOWED
}