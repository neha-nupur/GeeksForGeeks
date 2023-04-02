/* Given a number and its reverse. Find that number raised to the power of its own reverse.
Note: As answers can be very large, print the result modulo 109 + 7.

Example 1:

Input:
N = 2
Output: 4
Explanation: The reverse of 2 is 2
and after raising power of 2 by 2 
we get 4 which gives remainder as 
4 by dividing 1000000007. */

public class PowerOfNumber {

    static long mod = 1000000007L;

    static long power(int n, int r) {
        if (r == 1) {
            return n;
        }
        if (r % 2 == 0) {
            long temp = power(n, r/2) % mod;
            return (temp * temp) % mod;
        } else {
            return (n * power(n, r-1) % mod);
        }
    }

    public static void main(String[] args) {
        int n = 2;
        int r = 3;
        long result = power(n, r);
        System.out.printf("%d^%d mod %d = %d\n", n, r, mod, result);
    }
}
