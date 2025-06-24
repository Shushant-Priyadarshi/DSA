package arrays.easy;

public class CheckSorted {
    private static boolean checkSorted(int[] nums){
        for(int i =1 ; i < nums.length ; i++){
          if(nums[i] < nums[i-1]) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[] = {34,212,432,543,3244};
        System.out.println(checkSorted(arr));
    }
}
