package practice.arrays;

import java.util.Arrays;

public class SlidingWindow {
    public static void main(String[] args) {
        int[] arr= {5,4,6,3};
        //getAllSubArrays(arr);

        String str = "aabbsccee";

//        for(int  i =0 ; i<str.length() ;i++){
//            System.out.print(str.charAt(i)+" ");
//        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void  getAllSubArrays(int[] arr){
        int x = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
    }
}
