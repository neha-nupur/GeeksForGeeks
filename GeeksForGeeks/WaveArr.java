// Given a sorted array arr[] of distinct integers. Sort the array into a wave-like array(In Place).
// In other words, arrange the elements into a sequence such that arr[1] >= arr[2] <= arr[3] >= arr[4] <= arr[5].....

// If there are multiple solutions, find the lexicographically smallest one.

// Note:The given array is sorted in ascending order, and you don't need to return anything to make changes in the original array itself.

// Example 1:

// Input:
// n = 5
// arr[] = {1,2,3,4,5}
// Output: 2 1 4 3 5
// Explanation: Array elements after 
// sorting it in wave form are 
// 2 1 4 3 5.

public class WaveArr {
    public static void convertToWave( int n, int[] a) {
        // for loop until length-1 and it will increase by index+2 in every iteration sort an array in wave form
        for(int i= 0; i < n-1; i=i+2) {
            //swap
            int temp = a[i];
            a[i] = a[i+1];
            a[i+1] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
    
        System.out.println("Original Array:");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    
        convertToWave(n, arr);
        
        System.out.println("\nWave array:");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    
}
