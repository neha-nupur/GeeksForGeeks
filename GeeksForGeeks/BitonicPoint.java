// Given an array arr of n elements that is first strictly increasing and then maybe strictly decreasing, find the maximum element in the array.
// Note: If the array is increasing then just print the last element will be the maximum value.

// Example 1:

// Input: 
// n = 9
// arr[] = {1,15,25,45,42,21,17,12,11}
// Output: 45
// Explanation: Maximum element is 45.



public class BitonicPoint {
    static int findMaximum(int[] arr, int n) {
        
        int max=Integer.MIN_VALUE;   // Initialize with MIN VALUE
   
         for(int i=0; i<n ;i++){
   
             if(arr[i] > max) // check if arr[i] is greater than max
             max = arr[i];  
         }
   
          return max;
   
       }
       
       public static void main(String[] args) {
        int[] arr = {1, 15, 25, 45, 42, 21, 17, 12, 11};
        int n = arr.length;
        int maxElement = findMaximum(arr, n);
        System.out.println("Maximum element in the array is: " + maxElement);
    }
    
}
