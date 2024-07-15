package Binary_Search;

import java.util.Arrays;

public class RowColMatrix {
    public static void main(String[] args) {
    int [][] arr = {
            {-5}
    };
        System.out.println(Arrays.toString(search(arr, -5)));
    }
    static int[] search(int[][] matrix, int target){
        int row = 0;
        int col = matrix[0].length -1;

        while(row < matrix.length-1 && col >= 0){
            if(matrix[row][col] == target){
                return new int[]{row,col};
            }
            if (matrix[row][col] < target){
                row++;
            }else {
                col--;
            }
        }
return new int[]{-1,-1};
    }
}
