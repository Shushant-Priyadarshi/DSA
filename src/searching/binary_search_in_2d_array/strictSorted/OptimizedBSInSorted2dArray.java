package searching.binary_search_in_2d_array.strictSorted;

import java.util.Arrays;

/*
    suppose you are flattening the 2d array into 1d array:
        then applying BS on it, and finding out the mid.

        Now at the back of the mind if we could be able to covert this
        mid(index) into row and column indexes(coordinates) then it would be
        easier to apply this algo.

        Formula:

            1) index / m = row coordinate
            2) index % m  = col coordinate

            where ( m = no. of columns )

        ex: target = 18 => mid = 5
               row =  5/4  = 1
               col = 5%4 = 1
 */
public class OptimizedBSInSorted2dArray {
    public static void main(String[] args) {
        int[][] matrix = {
                {3,4,7,9},
                {12,13,16,18},
                {20,21,23,29}
        };
        int target = 7;

        System.out.println(Arrays.toString(OptBsIn2d(matrix,target)));
    }

    private static int[] OptBsIn2d(int[][] matrix, int target) {
        int low = 0;
        int high = (matrix.length * matrix[0].length) -1;

        while(low <= high){
            int mid = low + (high-low)/2;

            //convert mid to coordinate
            int row = mid/matrix[0].length;
            int col = mid % matrix[0].length;

            if(matrix[row][col] == target){
                return new int[]{row,col};
            }
            if(matrix[row][col] > target){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return new int[]{-1,-1};

    }
}
