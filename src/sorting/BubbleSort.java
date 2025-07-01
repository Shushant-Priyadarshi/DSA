package sorting;

import java.util.Arrays;

/*
* 1) Every iteration main largest element of unsorted array se uthakar last mai aa ajata h.
* 2) Every time ham adjacent element ko compare krte h
* 3) Agar mera second element first element se chota hota h sirf tabhi ham swap krte h
*
* */

public class BubbleSort {

    static void bubbleSort(int[] arr){
        boolean swapped;
        int n = arr.length;
        for(int i=0 ; i < n ; i++){
            swapped = false;
            for(int j=1; j< n-i; j++){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
