package basics.hashing;

import java.util.HashMap;

public class Hashmaps_impl {
    public static void main(String[] args) {
        int[] arr = {2,3,3,1,1,4,5,5,5,5};
        System.out.println(freqCount(arr,5));
    }

    private static int freqCount(int[] arr,int target){
        HashMap<Integer,Integer> hash = new HashMap<>();
        for(int num: arr){
            hash.put(num,hash.getOrDefault(num,0)+1);
        }
        return hash.get(target);
    }
}
