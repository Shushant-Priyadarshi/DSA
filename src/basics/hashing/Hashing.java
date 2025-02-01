package basics.hashing;
import java.util.*;
public class Hashing {

    public static ArrayList<Integer> frequencyCount(int arr[]){
        int n = arr.length;
        int[] hash = new int[n];

        for(int num:arr){
            //we are not considering 0 => [1,n]
            //we are checking if the input elements are less than length and above 0
            if(num >=1 && num<=n){
                //[0,n] => [1,n]
                hash[num-1]++;
            }
        }
        ArrayList<Integer> result = new ArrayList<>();
        for(int num:hash){
            result.add(num);
        }
        return result;
    }


        public static ArrayList<Integer> frequencyCountString(String s) {
        int[] hash = new int[26]; // Since 'a' to 'z'
        // Counting character frequencies
        for (char ch : s.toCharArray()) {
            hash[ch - 'a']++; // 'a' -> 0, 'b' -> 1, ..., 'z' -> 25
        }
        // Convert hash[] to ArrayList for output
        ArrayList<Integer> result = new ArrayList<>();
        for (int freq : hash) {
            result.add(freq);
        }
        return result;
    }

}
