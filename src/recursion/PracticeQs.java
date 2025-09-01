package recursion;

import java.util.*;

public class PracticeQs {
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,3};
        int k =2;
        System.out.println(topKele(arr,k));
    }


    private static List<Integer> topKele(int[] arr, int k ){
        ArrayList<Integer> result = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num :arr){
            map.put(num,map.getOrDefault(num,0) +1);
        }


        while( k > 0  && !map.isEmpty()){
            int maxKey = -1;
            int maxFreq = -1;
            for(Map.Entry<Integer, Integer> entries: map.entrySet()){
                if(entries.getValue() > maxFreq){
                    maxKey = entries.getKey();
                    maxFreq = entries.getValue();
                }
            }
            result.add(maxKey);
            map.remove(maxKey);
            k--;
        }

        return  result;
    }



    private static List<List<String>> groupAnagrams(String[] strs){
        HashMap<String, List<String>> result = new HashMap<>();
        for(String str : strs){
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);

            result.putIfAbsent(sorted,new ArrayList<>());
            result.get(sorted).add(str);

        }
        return new ArrayList<>(result.values());
    }

}
