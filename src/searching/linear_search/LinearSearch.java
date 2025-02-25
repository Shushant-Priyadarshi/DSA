package searching.linear_search;

public class LinearSearch {

     static int linearSearch(int[] arr, int key) {
        if(arr.length == 0) return -1;
        for(int i=0; i <arr.length;i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
//    arr.length is not a method but a final variable (property) of the array.
//    In Java, arrays are special objects, and .length is a directly accessible field.
//    No parentheses () are needed because it’s not a function call, just a variable access.

    static boolean searchInString(String str, Character key) {
         if(str.length() == 0) return false;
         for(int i=0; i < str.length(); i++){
             if(str.charAt(i) == key){
                 return true;
             }
         }
         return false;
    }

    //Minimum Numbers
    static int findMinimumNumber(int arr[]) {
         if(arr.length == 0 ) return Integer.MIN_VALUE;
         int minimum = arr[0];
         for(int i =0 ; i< arr.length ;i++){
             if(minimum > arr[i]){
                 minimum = arr[i];
             }
         }
         return minimum;
    }

    //2-D Array

}
