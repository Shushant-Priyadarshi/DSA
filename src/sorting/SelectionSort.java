package sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {54,23,67,1,3};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void selectionSort(int[] arr) {
        for(int i=0 ; i<arr.length ;i++){
            int last = arr.length -1 - i;
            //get max from the arr from 0 to last
            int maxIndex = getMax(arr,0,last);

            //swap the max element to the last element
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[last];
            arr[last]= temp;
        }
    }

    private static  int  getMax(int arr[],int start,int end){
        int max= start;
        for(int i=start; i<=end ;i++){
            if(arr[max] < arr[i]){
                max= i;
            }
        }
        return max;
    }
}
