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
}
