// Given an array of size N containing only 0s, 1s, and 2s; sort the array in ascending order.


// Example 1:

// Input: 
// N = 5
// arr[]= {0 2 1 2 0}
// Output:
// 0 0 1 2 2
// Explanation:
// 0s 1s and 2s are segregated 
// into ascending order.

public class Sort012 {
    public static void sort012(int a[], int n)
    {
        // code here 
        int count0 = 0;
        int count1 = 0; 
        int count2 = 0;
        
        for(int i=0; i<n; i++) {
            if(a[i] == 0) {
                count0++;
            }
            
            if(a[i] == 1) {
                count1++;
            }
            
            if(a[i] == 2) {
                count2++;
            }
        }
        
        for(int i=0; i<count0; i++) {
            a[i] = 0;
        }
        
        for(int i=count0; i<count0+count1; i++) {
            a[i] = 1;
        }
        
        for(int i=count0+count1; i< n; i++) {
            a[i] = 2;
        }
    }

    public static void main(String[] args) {
        int[] a = {0, 2, 1, 2, 0};
        int n = a.length;
        sort012(a, n);
        System.out.print("Sorted array is: ");
        for(int i=0; i<n; i++) {
            System.out.print(a[i] + " ");
        }
    }
    
}
