/* Given an array arr of integers, check if there exist two indices i and j such that :

i != j
0 <= i, j < arr.length
arr[i] == 2 * arr[j]
 

Example 1:

Input: arr = [10,2,5,3]
Output: true
Explanation: For i = 0 and j = 2, arr[i] == 10 == 2 * 5 == 2 * arr[j]
Example 2:

Input: arr = [3,1,7,11]
Output: false
Explanation: There is no i and j that satisfy the conditions.
 

Constraints:

2 <= arr.length <= 500
-103 <= arr[i] <= 103  */


class Solution {
  //Hashmap
    public boolean checkIfExist(int[] arr) {
        Set<Double> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (set.contains((double) arr[i] * 2) || set.contains((double) arr[i] / 2)) {
                return true;
            }
            set.add((double) arr[i]);
        }
        return false;
    }

    //Brute force
        // for(int i=0; i<arr.length; i++){
        //     for(int j = 0; j < arr.length; j++){
        //         if(i != j && arr[i] == 2 * arr[j]){
        //             return true;
        //         }
        //     }
        // }
        // return false;

    // public boolean checkIfExist(int[] arr) {    
    //     //Binary Search
    //     Arrays.sort(arr);

    //     for(int i=0; i < arr.length; i++){
    //         int target = arr[i] * 2;

    //         if(target == 0 && i+1 < arr.length && arr[i+1] == 0){
    //             return true;
    //         }else if(binarySearch(arr, target, i+1, arr.length - 1)){
    //             return true;
    //         }

    //         if(arr[i]!=0 && arr[i]%2 == 0 && binarySearch(arr, arr[i]/2, 0, i-1)){
    //             return true;
    //         }
    //     }
    //     return false;
    // }


    private boolean binarySearch(int[] arr, int target, int left, int right){
        while(left <= right){
            int mid = left + (right - left) / 2;

            if(arr[mid] == target){
                return true;
            } else if(arr[mid] < target){
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
}
