package recursion;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3,32,5,7,4,0};
        List<List<Integer>> result = new ArrayList<>();
        permutations(result, new ArrayList<>(), arr);
        System.out.println(result);
    }

    private static void permutations(List<List<Integer>> resultList, ArrayList<Integer> tempList, int[] nums) {
        if (tempList.size() == nums.length) {
            resultList.add(new ArrayList<>(tempList));
            return;
        }

        for (int num : nums) {
            if (tempList.contains(num)) {
                continue;
            }

            tempList.add(num);
            permutations(resultList, tempList, nums);
            tempList.removeLast();
        }
    }


}
