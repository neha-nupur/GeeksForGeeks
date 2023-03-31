/*  Given a sorted and rotated array A of N elements which is rotated at some point, and may contain duplicates and given an element key. Check whether the key exist in the array A or not.

Example 1:

Input:
N = 7
A[] = {2,5,6,0,0,1,2}
key = 0
Output:
1
Explanation:
0 is found at index 3. */

public class SearchinRotatedArraytwo {
    // Function to find the pivot point in the rotated array
    static int findPivot(int[] arr, int n) {
        int pivot = 0;
        
        for(int i=0;i<n-1;i++) {
            // If the current element is greater than the next element, then the next element is the pivot element
            if(arr[i] > arr[i+1]) {
                pivot = i+1;
            }
        }
        return pivot;
    }

    // Binary search function to find the index of the target element
    static int binarySearch(int[] arr, int s, int e, int key) {
        
        int start = s;
        int end = e;
        int mid = start+(end-start)/2;

        while(start<=end) {
            if(arr[mid] == key) {
                return mid;
            }
            
            if(key > arr[mid]) {
                start = mid+1;
            }
            // If the target element is smaller than the mid element, search in the left half of the search range
            else {
                end = mid-1;
            }
            // Update the mid index to the middle of the new search range
            mid = start+(end-start)/2;
        }
        // If the target element is not found, return -1
        return -1;
    }

    public static boolean Search(int N, int[] nums, int target) {

        // Find the pivot point in the rotated array
        int p = findPivot(nums, N);

        int ans = -1;
        // If the target element is between the pivot and the last element, search in the right half of the array
        if(target >= nums[p] && target <= nums[N-1]) {
            ans = binarySearch(nums, p, N-1, target);
        } 
        // If the target element is between the first element and the pivot, search in the left half of the array
        else {
            ans = binarySearch(nums, 0, p-1, target);
        }
        // If the target element is found, return true, else return false
        return ans != -1 ? true : false;
    }

    public static void main(String[] args) {

        int[] nums = {2,5,6,0,0,1,2};
        int target = 0;
        int N = nums.length;
    
        if(Search(N, nums, target)) {
            System.out.println("Target element exists in the array.");
        } else {
            System.out.println("Target element does not exist in the array.");
        }
    }
    
}
