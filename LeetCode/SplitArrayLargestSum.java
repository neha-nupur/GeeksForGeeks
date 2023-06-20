package com.Neha;

public class SplitArrayLargestSum {
    static class Solution {
        public int splitArray(int[] nums, int k) {
            int start = 0;
            int end = 0;

            for(int i=0; i<nums.length; i++){
                start = Math.max(start, nums[i]);

                //In the end this will contain the max item from the array - Simple Linear Search
                end += nums[i];
            }

            //Binary Search
            while(start < end){
                //try for the middle as potential answer
                int mid = start + (end - start) / 2;

                //Calculate how many pieces you can divide this in with this max sum
                int sum = 0;
                int pieces = 1;

                for(int num: nums){
                    if(sum + num > mid){
                        //you cannot add this in this subarray, make new one
                        //Say that you add this num in new subarray, then sum = num
                        sum = num;
                        pieces++;
                    } else {
                        sum += num;
                    }
                }
                if(pieces > k){
                    start = mid + 1;
                } else {
                    end = mid;
                }
            }
            return end;
        }
    }

    public static void main(String[] args) {
        int[] nums = {7,2,5,10,8};
        int k = 2;
        Solution solution = new Solution();
        int result = solution.splitArray(nums, k);
        System.out.println(result);
    }
}