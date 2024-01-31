
//Check Dicimal to Binary ?:- 
import java.util.*;

public class Dicimal {
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

    public static void main(String[] args) {
        binToDec(101);
    }
}
/*
 * Output:-
 * decimal of 101 = 5
 */
