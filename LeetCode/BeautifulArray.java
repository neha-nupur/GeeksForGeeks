/*   1. Create an integer array of size n to hold the beautiful array.
    2. Initialize the first element to 1, which is always a part of the beautiful array.
    3. Initialize a variable 'len' to 1, which will be used to keep track of the number of elements in the array at each iteration.
    4. For each integer 'i' in the range 2 to n (inclusive), do the following:
        a. Create an empty ArrayList 'temp', which will hold the elements of the beautiful array generated from the previous iteration.
        b. Iterate over the elements in the current beautiful array (up to index 'len'), and for each element 'e', if 2 * e is less than or equal to n, add the value e2 to the ArrayList 'temp'.
        c. Iterate over the elements in the current beautiful array (up to index 'len'), and for each element 'e', if 2 * e - 1 is less than or equal to n, add the value e2-1 to the ArrayList 'temp'.
        d. Set the value of 'len' to the size of the ArrayList 'temp', which represents the number of elements in the beautiful array generated from the current iteration.
        e. Copy the elements from the ArrayList 'temp' into the beautiful array.
    5. Return the beautiful array.  */

import java.util.*;

public class BeautifulArray {

    public static int[] beautifulArray(int n) {
        int ans[] = new int[n];
        ans[0] = 1; 
        int len = 1;

        for(int i=2; i<=n; i++) {
            ArrayList<Integer> temp = new ArrayList<Integer>();
            for(int j=0; j<len; j++) {
                int e = ans[j];
                if(2 * e <= n) {
                    temp.add(e*2);
                }
            }

            for(int j=0; j<len; j++) {
                int e = ans[j];
                if(2 * e - 1 <= n) {
                    temp.add(e*2-1);
                }
            }
            len = temp.size();
            for(int j=0; j<len; j++) {
                ans[j] = temp.get(j);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 4;
        int[] result = beautifulArray(n);
        System.out.println(Arrays.toString(result));
    }
    
    
}
