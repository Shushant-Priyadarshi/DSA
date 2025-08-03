package sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {7,6,10,5,9,2,15,7};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr, int start, int end) {
        if(start<end){
            int sortedPart = partition(arr,start,end);
            quickSort(arr,start,sortedPart-1);
            quickSort(arr,sortedPart+1,end);
        }
    }

    private static int partition(int[] arr, int lb,int ub){
        int pivot = arr[lb];
        int start = lb;
        int end = ub;
        while(start < end){

            while(start < arr.length && arr[start] <= pivot){
                start++;
            }

            while(end >= 0 && arr[end] > pivot){
                end--;
            }

            if(start<end){
                swap(arr,start,end);
            }

        }
        swap(arr,lb,end);
        return end;

    }

    private static void swap(int[]arr, int e1, int e2){
        int temp = arr[e1];
        arr[e1] =arr[e2];
        arr[e2] =temp;
    }


}
