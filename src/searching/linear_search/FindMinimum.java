package searching.linear_search;

public class FindMinimum {
    //Minimum Numbers
    static int findMinimumNumber(int[] arr) {
        if(arr.length == 0 ) return Integer.MIN_VALUE;
        int minimum = arr[0];
        for(int i =0 ; i< arr.length ;i++){
            if(minimum > arr[i]){
                minimum = arr[i];
            }
        }
        return minimum;
    }

    public static void main(String[] args) {
        int arr[] = {54,32,-65,10,23,90,40};
        System.out.println(findMinimumNumber(arr));
    }
}
