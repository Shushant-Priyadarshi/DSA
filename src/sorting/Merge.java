package sorting;

import java.util.Arrays;

public class Merge {
    public static void main(String[] args) {
        int[] arr = {4,1,2,6,8,67,23,787,234,331,762,3667,3434,0,0,0,1};
        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static  void mergeSort(int[] arr,int start,int end){
        if(start < end){ //at lease 2 elements
            int mid = (start+end)/2;
            mergeSort(arr,start,mid);
            mergeSort(arr,mid+1,end);
            merge(arr,start,mid,end);
        }
    }

    static void merge(int[] arr, int start,int mid,int end){
        int[] arr2 = new int[arr.length];

        int i=start;
        int j = mid+1;
        int k =start;

        while(i <= mid && j <= end){
            if(arr[i] <= arr[j]){
                arr2[k]= arr[i];
                i++;
            }else{
                arr2[k] = arr[j];
                j++;
            }
            k++;
        }

        while( i <= mid){
            arr2[k] = arr[i];
            i++;
            k++;
        }

        while(j <= end){
            arr2[k] = arr[j];
            j++;
            k++;
        }

        for(int l=start; l<=end; l++){
            arr[l] = arr2[l];
        }
    }
}
