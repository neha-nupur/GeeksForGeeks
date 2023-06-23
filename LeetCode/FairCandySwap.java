/* Alice and Bob have a different total number of candies. You are given two integer arrays aliceSizes and bobSizes where aliceSizes[i] is the number of candies of the ith box of candy that Alice has and bobSizes[j] is the number of candies of the jth box of candy that Bob has.

Since they are friends, they would like to exchange one candy box each so that after the exchange, they both have the same total amount of candy. The total amount of candy a person has is the sum of the number of candies in each box they have.

Return an integer array answer where answer[0] is the number of candies in the box that Alice must exchange, and answer[1] is the number of candies in the box that Bob must exchange. If there are multiple answers, you may return any one of them. It is guaranteed that at least one answer exists.

 

Example 1:

Input: aliceSizes = [1,1], bobSizes = [2,2]
Output: [1,2]
Example 2:

Input: aliceSizes = [1,2], bobSizes = [2,3]
Output: [1,2]
Example 3:

Input: aliceSizes = [2], bobSizes = [1,3]
Output: [2,3]
 

Constraints:

1 <= aliceSizes.length, bobSizes.length <= 104
1 <= aliceSizes[i], bobSizes[j] <= 105
Alice and Bob have a different total number of candies.
There will be at least one valid answer for the given input. */



class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumAlice = Arrays.stream(aliceSizes).sum();
        int sumBob = Arrays.stream(bobSizes).sum();

        int target = (sumAlice - sumBob) / 2;

        Arrays.sort(aliceSizes);
        Arrays.sort(bobSizes);

        for(int aliceSize: aliceSizes){
            int left = 0;
            int right = bobSizes.length - 1;
        

        while(left <= right) {
            int mid = left + (right - left) / 2;

            int diff = aliceSize - bobSizes[mid];

            if(diff == target){
                return new int[] {aliceSize, bobSizes[mid]};
            } else if (diff < target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        }
        return new int[]{}; //Empty array if fair swap possible.
    }
}
