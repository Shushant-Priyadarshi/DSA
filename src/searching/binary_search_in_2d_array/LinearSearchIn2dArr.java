package searching.binary_search_in_2d_array;

public class LinearSearchIn2dArr {
    public static void main(String[] args) {
        int[][] arr = {{23,21,43},
                       {55,65,76},
                       {12,49,3}};

        int target = 55;
//        int[] result = search(arr,target);
//        for(int ele: result){
//            System.out.println(ele);
//        }
        System.out.println(arr.length);
    }

    static int[] search(int arr[][] , int target){
        for(int i =0 ; i< arr.length ; i++){
            for(int j = 0; j<arr[i].length; j++){
                if(arr[i][j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1, -1};
    }


}
