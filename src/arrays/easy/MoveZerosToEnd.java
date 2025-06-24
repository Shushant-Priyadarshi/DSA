package arrays.easy;

public class MoveZerosToEnd {

    private static int[] MovesZeros(int[] nums){
        int[] newArr = new int[nums.length];
        int index= 0;
        for(int i = 0 ; i< nums.length ; i++){
           if(nums[i] != 0){
               newArr[index] = nums[i];
               index++;
           }
        }
        return newArr;
    }

    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        int[] resultArr = MovesZeros(arr);
        for(int ele: resultArr){
            System.out.print(ele+" ");
        }
    }
}
