package arrays.easy;

public class SecondLargestElement {
    public static void main(String[] args) {
        int arr[] = {10,20,90,45,12,88,87};
        System.out.println(secondLargest(arr));
    }

    private static int secondLargest(int[] nums) {
        int largest = nums[0];
        int secondLargest = nums[1];

        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] > largest) {
                largest = nums[i];
            } else if (nums[i] > secondLargest && nums[i] != largest) {
                secondLargest = nums[i];
            }
        }
        return secondLargest;
    }
}
