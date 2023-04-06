public class MostFreqNoFollowingKey {
    public static int mostFrequent(int[] nums, int key) {
        int result[] = new int[1000]; //array of elements to hold the frequency counts

        for(int i=0; i<nums.length-1; i++) {  // For finding the element 
            if(nums[i] == key) {
                result[nums[i+1]-1] ++; //it increments the element in the result array whose index is one less than the next element in nums.
            }
        }


        // To find the maximum frequency count and the corresponding element
        int max = Integer.MIN_VALUE; 
        int ans = 0;

        for(int i=0; i<1000; i++) { // If the frequency count at this index is greater than the current maximum 
            if(result[i] > max) {
                max = result[i]; // Update the maximum count
                ans = i+1;  // Update the answer to the corresponding element (adding 1 to adjust for 0-based indexing)
            }
        }

        return ans; // return most freq element
    }

    public static void main(String[] args) {
        int[] nums = {1, 100, 200, 1, 100};
        int key = 1;
        int mostFrequentElement = mostFrequent(nums, key);
        System.out.println("The most frequent element after " + key + " is: " + mostFrequentElement);
    }
    

}