/*  Print a sequence of numbers starting with N where A[0] = N, without using loop, in which  A[i+1] = A[i] - 5,  until A[i] > 0. After that A[i+1] = A[i] + 5  repeat it until A[i] = N.

Example 1:

Input: N = 16
Output: 16 11 6 1 -4 1 6 11 16
Explaination: The value decreases until it 
is greater than 0. After that it increases 
and stops when it becomes 16 again. */

import java.util.ArrayList;

public class RecPrintPattern {
    static ArrayList<Integer> pattern(int N){
    
        ArrayList<Integer> list = new ArrayList<>();
        helper(list,N);
        return list;
        }
        
        public static void helper(ArrayList<Integer> list,int n){
            if(n<=0){
                list.add(n);
                return;
            }
            
            if(n>0){
                list.add(n);
                helper(list,n-5);
                list.add(n);
            }
        }

        public static void main(String[] args) {
            int N = 16;
            ArrayList<Integer> result = pattern(N);
            System.out.println(result);
        }
        
}
