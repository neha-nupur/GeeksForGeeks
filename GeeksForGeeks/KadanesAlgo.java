/* Given an array Arr[] of N integers. Find the contiguous sub-array(containing at least one number) which has the maximum sum and return its sum.


Example 1:

Input:
N = 5
Arr[] = {1,2,3,-2,5}
Output:
9
Explanation:
Max subarray sum is 9
of elements (1, 2, 3, -2, 5) which 
is a contiguous subarray. */


public class KadanesAlgo {
    //Function to find the sum of contiguous subarray with maximum sum.
    static long maxSubarraySum(int arr[], int n){
        long maxSum = arr[0];
        long currSum = arr[0];
        
        //Iterating through the array from index 1.
        for (int i = 1; i < n; i++) {
            currSum = Math.max(currSum + arr[i], arr[i]);
            maxSum = Math.max(maxSum, currSum);
        }
        
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, -2, 5};
        int n = arr.length;
    
        long maxSum = maxSubarraySum(arr, n);
    
        System.out.println("Max subarray sum is " + maxSum);
    }
    
}
