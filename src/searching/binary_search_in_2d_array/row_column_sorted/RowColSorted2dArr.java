package searching.binary_search_in_2d_array.row_column_sorted;

import java.util.Arrays;

public class RowColSorted2dArr {
    public static void main(String[] args) {
        int arr[][] ={
                {1,4,7,11,15},
                {2,5,8,12,19},
                {3,6,9,16,22},
                {10,13,14,17,24},
                {18,21,23,26,30}
        };
        int target =10;
        System.out.println(Arrays.toString(BinSearchRowCol(arr,target)));
        System.out.println(Arrays.toString(OptimizedBinSearchRowCol(arr,target)));
    }

    private static int[] OptimizedBinSearchRowCol(int[][] arr, int target){
        int n = arr.length;
        int m = arr[0].length;

        int row = 0;
        int col = m-1;

        while(row < n && col >= 0){
            if(arr[row][col] == target){
                return new int[]{row,col};
            }
            if(arr[row][col] > target){
                col --;
            }else{
                row++;
            }
        }
        return new int[]{-1,-1};
    }

    private static int[] BinSearchRowCol(int[][] arr, int target) {
        int n = arr.length;
        for(int i =0 ; i < n ; i++){
            int index = binarySearch1DArr(arr[i],target);
            if(index != -1){
                return new int[]{i,index};
            }
        }
        return new int[]{-1,-1};
    }

    static int binarySearch1DArr(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid =  start + (end-start)/2;

            if(arr[mid] == target){
                return mid;
            }
            if(arr[mid]> target){
                end = mid -1;
            }else {
                start = mid+1;
            }
        }
        return -1;
    }
}
