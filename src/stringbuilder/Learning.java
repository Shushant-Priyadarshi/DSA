package stringbuilder;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
* Whenever we make changes to a string a new string is created in the heap memory
* This creation takes some time and can increase the overall time taken by a huge softwares
*
* With StringBuilder any change in the string does not make a new string ,rather it change the
* string directly in the heap memory
* */
public class Learning {

    public static  int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> hashMap = new HashMap<>();
        int n = nums.length;

        for(int i = 0 ; i<n ;i++){
            int complement = target - nums[i];
            if(hashMap.containsKey(complement)){
                return new int[]{hashMap.get(complement), i};
            }
            hashMap.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
//        StringBuilder sb  = new StringBuilder("Bru");
//        System.out.println(sb);
//
//        sb.insert(3,"h");
//        System.out.println(sb);
//
//        sb.delete(3,4);
//        System.out.println(sb);
//

        int[] arr = {2,7,11,15};
        int[] result = twoSum(arr, 22);
        System.out.println(result);
    }
}
