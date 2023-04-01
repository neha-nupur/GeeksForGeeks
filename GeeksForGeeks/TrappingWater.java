public class TrappingWater {
    // arr: input array
    // n: size of array
    // Function to find the trapped water between the blocks.
    static long trappingWater(int arr[], int n) { 
        // Your code here
        
        //calculate leftMax boundary - array
        int leftMax[] = new int[n];
        leftMax[0] = arr[0];
        for(int i=1; i<n; i++) {
            leftMax[i] = Math.max(arr[i], leftMax[i-1]);
        }
        
        //calculate rightMax boundary - array
        int rightMax[] = new int[n];
        rightMax[n-1] = arr[n-1];
        for(int i=n-2; i>=0; i--) {
            rightMax[i] = Math.max(arr[i], rightMax[i+1]);
        }
        
        
        long trappedWater = 0;
        //loop
        for(int i=0; i<n; i++) {
            //waterlevel = min(leftMax boundary, rightMax boundary) 
            long waterLevel = Math.min(leftMax[i], rightMax[i]);
            
            //trapped water = trapped water + waterlevel - height[i]
            trappedWater += waterLevel - arr[i];
        }   
        return trappedWater;  
    }

    public static void main(String args[]) {
        int arr[] = {4, 2, 0, 6, 3, 2, 5};
        int n= 7;
        System.out.println(trappingWater(arr, n));
    }
}