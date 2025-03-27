package searching.binary_search.questions;

public class CeilingAndFloorOfANumber {
     static int ceiling(int[] arr,int target){
        int start =0;
        int end = arr.length-1;

        //ceiling does not exist for largest element
        if(target > arr[end]){
            return -1;
        }
        while (start <= end) {
             int middle = start + (end - start) / 2;

             if (arr[middle] == target) {
                 return middle;
             } else if (arr[middle] > target) {
                 end = middle - 1;
             } else {
                 start = middle + 1;
             }
         }
         return start; // 'start' will point to the smallest element greater than the target.

    }


    static int floor(int[] arr,int target){
        int start =0;
        int end = arr.length-1;

        while (start <= end) {
            int middle = start + (end - start) / 2;

            if (arr[middle] == target) {
                return middle;
            } else if (arr[middle] > target) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }
        }
        return end;
    }

    public static void main(String[] args) {
        int[] arr = {2,8,10,25,30,35};
        int target = 29;
        int result = ceiling(arr,target);
        System.out.println(result);

    }
}
