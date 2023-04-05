/* Given two lists V1 and V2 of sizes n and m respectively. Return the list of elements common to both the lists and return the list in sorted order. Duplicates may be there in the output list.

Example:

Input:
n = 5
v1[] = {3, 4, 2, 2, 4}
m = 4
v2[] = {3, 2, 2, 7}
Output:
2 2 3
Explanation:
The common elements in sorted order are {2 2 3} */

import java.util.*;

public class CommonElements {
    public static ArrayList<Integer> common_element(int v1[], int v2[]){
        Arrays.sort(v1);
        Arrays.sort(v2);
        
        int i=0,j=0;
        int n=v1.length;
        int m=v2.length;
  
        ArrayList<Integer> ans=new ArrayList<>();
  
        while(i<n&&j<m){
  
            if(v1[i]<v2[j])
              i++;
          else if(v1[i]>v2[j])
              j++;
          else{
              ans.add(v1[i]);
               i++;
               j++;
            }
        }
  
       return ans; 
  
      }

      public static void main(String[] args) {
        int[] v1 = {3, 4, 2, 2, 4};
        int[] v2 = {3, 2, 2, 7};
        
        ArrayList<Integer> common = common_element(v1, v2);
        
        if (common.isEmpty()) {
            System.out.println("There are no common elements between the arrays.");
        } else {
            System.out.print("The common elements between the arrays are: ");
            for (int i = 0; i < common.size(); i++) {
                System.out.print(common.get(i) + " ");
            }
        }
    }
    
}
