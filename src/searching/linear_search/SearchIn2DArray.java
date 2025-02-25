package searching.linear_search;

public class SearchIn2DArray {


    static int[] searchIn2D(int[][] arr,int target){
        for(int i = 0 ; i<arr.length ;i++){
            for(int j =0 ;j < arr[i].length ;j++){
                if(arr[i][j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[][] arr2D = {
                {23,21,43},
                {4,3,1},
                {8,9},
                {90,0,5,6}
        };
        int[] result =searchIn2D(arr2D, 9);
        System.out.println(result[0]+","+result[1]);
    }
}
