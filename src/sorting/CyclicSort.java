package sorting;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int arr[] = {3,5,2,1,4};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }


    private static void cyclicSort(int[] arr) {
        int i =0;
        while( i< arr.length){
            int correctIdx = arr[i] -1;
            if(i != correctIdx){
                swap(arr,i,correctIdx);
            }else{
                i++;
            }
        }
    }

    private static void swap(int[] arr, int e1 ,int e2){
        int temp =  arr[e1];
        arr[e1] = arr[e2];
        arr[e2] = temp;
    }



//    private static void cyclicSort(int[] arr) {
//        int i=0;
//        while(i < arr.length){
//            int correct = arr[i] -1;
//            if(arr[correct] != arr[i]){
//                int temp = arr[correct];
//                arr[correct] = arr[i];
//                arr[i] = temp;
//            }else{
//                i++;
//            }
//        }
//    }
}
