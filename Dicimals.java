
//Code-Decimal to Binary ?:- 
import java.util.*;

public class Dicimals {
    public static void binToDec(int binnum) {
        int mynum = binnum;
        int pow = 0;
        int decnum = 0;
        while (binnum > 0) {
            int lastDigit = binnum % 10;
            decnum = decnum + (lastDigit * (int) Math.pow(2, pow));
            pow++;
            binnum = binnum / 10;
        }
        System.out.println("decimal of " + mynum + " = " + decnum);
    }

    public static void decToBin(int n) {
        int mynum = n;
        int pow = 0;
        int binnum = 0;
        while (n > 0) {
            int rem = n % 2;
            binnum = binnum + (rem * (int) Math.pow(10, pow));
            pow++;
            n = n / 2;
        }
        System.out.println("binary from of " + mynum + "=" + binnum);
    }

    public static void main(String[] args) {
        decToBin(7);
    }
}
/*
 * Output:-
 * binary from of 7=111
 */
