package basics.hashing;

public class IntegerHashing {
    public static void main(String[] args) {
        int[] arr = {2,3,3,1,1,4,5,5,5,7,4,2};
        //System.out.println(freqCount(arr,5));



    }

    private static int freqCount(int[] arr, int target){
        int[] hash = new int[findMax(arr)+1];
        for (int j : arr) {
            hash[j]++;
        }
        return hash[target];
    }

    private static int findMax(int[] nums){
        int max = Integer.MIN_VALUE;
        for(int num:nums){
            max= Math.max(max,num);
        }
        return max;
    }
}
