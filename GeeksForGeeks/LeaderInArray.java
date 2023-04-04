/* Given an array A of positive integers. Your task is to find the leaders in the array. 
An element of array is leader if it is greater than or equal to all the elements to its right side. 
The rightmost element is always a leader. 

 

Example 1:

Input:
n = 6
A[] = {16,17,4,3,5,2}
Output: 17 5 2
Explanation: The first leader is 17 
as it is greater than all the elements
to its right.  Similarly, the next 
leader is 5. The right most element 
is always a leader so it is also 
included. */

import java.util.ArrayList;
import java.util.Collections;


public class LeaderInArray {
    
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        ArrayList<Integer> result = new ArrayList<>();
        
        // Assume that the last element is the leader.
        int currentLeader = arr[n-1];
        result.add(currentLeader);
        
        // Iterate the array in reverse order and check if each element is 
        // greater than or equal to the current leader. If so, we add it to the
        // result list and update the current leader.
        for (int i = n-2; i >= 0; i--) {
            if (arr[i] >= currentLeader) {
                currentLeader = arr[i];
                result.add(currentLeader);
            }
        }
        
        // Reverse the result list to get the leaders in the correct order.
        Collections.reverse(result);
        
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        int n = arr.length;
        
        ArrayList<Integer> result = leaders(arr, n);
        
        System.out.print("Leaders: ");
        for (int leader : result) {
            System.out.print(leader + " ");
        }
    }
    
}
