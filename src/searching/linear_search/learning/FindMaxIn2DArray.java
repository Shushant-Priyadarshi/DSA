package searching.linear_search.learning;

public class FindMaxIn2DArray {

    static int findMax(int[][] arr){
        int ans = arr[0][0];
        for(int i=0 ; i<arr.length;i++){
            for(int j=0; j< arr[i].length ;j++){
                if(ans < arr[i][j] ){
                    ans = arr[i][j];
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] arr2D = {
                {23,21,43},
                {4,3,1},
                {8,9},
                {90,0,5,6}
        };

        System.out.println(findMax(arr2D));
    }
}
