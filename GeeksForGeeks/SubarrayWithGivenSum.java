/* Given an unsorted array A of size N that contains only positive integers, find a continuous sub-array that adds to a given number S and return the left and right index(1-based indexing) of that subarray.

In case of multiple subarrays, return the subarray indexes which come first on moving from left to right.

Note:- You have to return an ArrayList consisting of two elements left and right. In case no such subarray exists return an array consisting of element -1.

Example 1:

Input:
N = 5, S = 12
A[] = {1,2,3,7,5}
Output: 2 4
Explanation: The sum of elements 
from 2nd position to 4th position 
is 12. */

import java.util.*;

public class SubarrayWithGivenSum {
    
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        ArrayList<Integer> result = new ArrayList<>();
        int currSum = 0, start = 0, end = 0; 
        boolean found = false; // indicate if we've found the subarray
        for (int i = 0; i < n; i++) {
            currSum += arr[i]; // add the current element to the sum
            end = i; // update the ending index
            if (currSum >= s) { 
                while (currSum > s && start < end) { // remove elements from the start until currSum is less than or equal to s
                    currSum -= arr[start];
                    start++;
                }
                if (currSum == s) { // if we've found a subarray that adds up to s
                    result.add(start + 1); // add the starting index of the subarray to the result ArrayList
                    result.add(end + 1); // add the ending index of the subarray to the result ArrayList
                    found = true; 
                    break; 
                }
            }
        }
        if (!found) { // if we haven't found any subarray that adds up to s
            result.add(-1); // add -1 to the result ArrayList
        }
        return result; // return the result ArrayList
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 20, 3, 10, 5};
        int n = arr.length;
        int s = 33;
    
        ArrayList<Integer> result = subarraySum(arr, n, s);
        if (result.get(0) == -1) {
            System.out.println("No subarray found");
        } else {
            System.out.println("Subarray found between indexes " + result.get(0) + " and " + result.get(1));
        }
    }
    
}
