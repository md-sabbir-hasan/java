
package idbexamprac;

import java.util.Arrays;

public class twoDimArray {
    public static void main(String[] args) {
        int [][]matrix = new int[5][5];
        
        matrix[0][1] = 5;
        matrix[0][2] = 6;
        
        
        int [][] matrix2 = {{1,2,3},{4,5,6},{7,8}};
        
        
        
        System.out.println(Arrays.deepToString(matrix));
        System.out.println(Arrays.deepToString(matrix2));
        
    }
  
}
