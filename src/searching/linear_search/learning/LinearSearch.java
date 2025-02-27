package searching.linear_search.learning;

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

    public static void main(String[] args) {
        int arr[] = {54,32,-65,10,23,90,40};
        int target = 3;
        System.out.println(LinearSearch.linearSearch(arr, target));
        System.out.println(LinearSearch.searchInString("Shushant",'m'));
    }

}
