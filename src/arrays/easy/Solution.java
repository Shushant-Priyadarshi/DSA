package arrays.easy;



class Solution {
    public static int linearSearch(int nums[], int target) {
        for(int i = 0 ; i<= nums.length-1; i++){
            if(nums[i] == target) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 2, -4, 4, 0, 10};
        System.out.println(linearSearch(arr,6));
    }
}