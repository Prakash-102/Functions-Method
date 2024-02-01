
//Check a prime number 1 to 20 ?:- 
import java.util.*;

public class CheckPrime {

    public static boolean isprime(int n) {
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void primesInRange(int n) {
        for (int i = 2; i <= n; i++) {
            if (isprime(i)) { // true
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        primesInRange(20);
    }
}
/*
 * Output:-
 * Prime number = 2 3 5 7 11 13 17 19
 */
