package arrays.easy;

public class CountOccurenceOfElement {
    public  static int count4(int[] nums,int target){
        int count=0;
        for(int num: nums){
            if(num == target) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1,4,2,3,4,5};
        System.out.println(count4(arr,4));
    }
}
