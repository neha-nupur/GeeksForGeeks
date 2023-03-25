
// Given an array A of size N of integers. Your task is to find the minimum and maximum elements in the array.


// Input:
// N = 6
// A[] = {3, 2, 1, 56, 10000, 167}
// Output:
// min = 1, max =  10000


 class pair  
{  
    long first, second;  
    public pair(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
} 

class Compute 
{
    static pair getMinMax(long a[], long n)  
    {
        //Write your code here
        long maximum = Integer.MIN_VALUE;
        long minimum = Integer.MAX_VALUE;
        
        for(int i=0; i < n ; i++) {
            if(maximum < a[i]) {
                maximum = a[i];
            }
            
            if(minimum > a[i]) {
                minimum = a[i];
            }
            
        }
        return new pair(minimum, maximum);
    }

}

public class findMaxMin {
    static pair getMinMax(long a[], long n)  
    {
        //Write your code here
        long maximum = Integer.MIN_VALUE;
        long minimum = Integer.MAX_VALUE;
        
        for(int i=0; i < n ; i++) {
            if(maximum < a[i]) {
                maximum = a[i];
            }
            
            if(minimum > a[i]) {
                minimum = a[i];
            }
            
        }
        return new pair(minimum, maximum);
    }

    public static void main(String[] args) {
        long[] a = {1, 5, 9, 3, 7, 2};
        long n = a.length;
        
        pair minMax = getMinMax(a, n);
        
        System.out.println("Minimum element is: " + minMax.first);
        System.out.println("Maximum element is: " + minMax.second);
    }
    

}
