import java.util.*;

public class DuplicatesInArray {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            list.add(arr[i]);
            arr[i] = 0;
        }
        
        for(int i=0;i<n;i++){
            arr[list.get(i)]++;
        }
        list.clear();
        
        for(int i=0;i<n;i++){
            if(arr[i] > 1){
                list.add(i);
            }
        }
        
        
           if(list.size() == 0){
           list.add(-1);
           return list;
        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 6, 4, 5, 5, 6};
        int n = arr.length;
        ArrayList<Integer> duplicateList = duplicates(arr, n);
        System.out.println(duplicateList);
    }
    
}
