package dsa.functions;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
//        boolean ans = isPrime(n);


        // print all the three digit armstrong no.
        for (int i=100; i<1000; i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
            }
        }
    }

    // Print all the three digit armstrong no.
    static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;
        while (n>0) {
            int rem = n % 10;
            n /= 10;
            sum = sum + rem*rem*rem;
        }
        return sum == original;
    }

    static boolean isPrime(int n) {
        if (n<=1) {
            return false;
        }
        int c = 2;
        while (c * c <= n) {
            if (n % c == 0){
                return false;
            }
            c++;
        }
        /*
        if (c * c > n) {
            return true;
        }
        else {
            return false;
        }
        */

        return c * c > n ;
    }
}
