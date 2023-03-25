
// Write a program to find the transpose of a square matrix of size N*N. 
// Transpose of a matrix is obtained by changing rows to columns and columns to rows.

// Input:
// N = 4
// mat[][] = {{1, 1, 1, 1},
//            {2, 2, 2, 2}
//            {3, 3, 3, 3}
//            {4, 4, 4, 4}}
// Output: 
// {{1, 2, 3, 4},  
//  {1, 2, 3, 4}  
//  {1, 2, 3, 4}
//  {1, 2, 3, 4}} 



public class Transpose {
    //Function to find transpose of a matrix.
    static void transpose(int matrix[][], int n)
    {
        
        
        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int n = 3;
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    
        System.out.println("Original Matrix:");
        printMatrix(matrix);
    
        transpose(matrix, n);
    
        System.out.println("Transposed Matrix:");
        printMatrix(matrix);
    }
    
    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    

}
