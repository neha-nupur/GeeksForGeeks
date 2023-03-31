/*  Given an array A[ ] of positive integers of size N, where each value represents the number of chocolates in a packet. 
Each packet can have a variable number of chocolates. There are M students, the task is to distribute chocolate packets
 among M students such that :
1. Each student gets exactly one packet.
2. The difference between maximum number of chocolates given to a student and minimum number of chocolates given to a student is minimum.

Example 1:

Input:
N = 8, M = 5
A = {3, 4, 1, 9, 56, 7, 9, 12}
Output: 6
Explanation: The minimum difference between 
maximum chocolates and minimum chocolates 
is 9 - 3 = 6 by choosing following M packets :
{3, 4, 9, 7, 9}.    */

import java.util.ArrayList;
import java.util.Collections;

public class ChocolateDistributionProblem {
    public static long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        // Appraoch - Sliding Window 
        int ans = Integer.MAX_VALUE;  // initialize ans with +infinity
        Collections.sort(a);  // Sort the Arraylist
        
        if(m>n) return -1;
        
        for(int i=0; i<=n-m; i++) {  // loop from index 0 to n-m means we have to traverse till we find m elements in n array 
            int minw = a.get(i);  // set minimum window to 0
            int maxw = a.get(i+m-1); // set maximum window to index (i+m-1)
            int gap = maxw - minw;  // this will give the gap between maximum window and minimum window
        
            if(gap < ans) { // if gap is having less difference than answet, i.e., ans = +infinity
                ans = gap; // set value of gap into ans
            }
        }
        
        return ans;  // return minimum gap of distribution
        
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(3);
        arr.add(4);
        arr.add(1);
        arr.add(9);
        arr.add(56);
        arr.add(7);
        arr.add(9);
        arr.add(12);

        int n = arr.size();
        int m = 5;

        long minDiff = findMinDiff(arr, n, m);

        System.out.println("The minimum difference between " + m + " elements is: " + minDiff);
    }
}
