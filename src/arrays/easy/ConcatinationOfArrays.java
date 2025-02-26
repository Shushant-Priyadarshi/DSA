package arrays.easy;

// 1929
public class ConcatinationOfArrays {
    public static void main(String[] args) {
        int[] arr = {74,34,21};
        int[] result = concatinateArrays(arr);
        for(int res:result){
            System.out.print(res+" ");
        }

    }

    private static int[] concatinateArrays(int[] arr) {
        int n = arr.length;
        int[] result = new int[n*2];
        for(int i = 0 ; i<n;i++){
            result[i] = arr[i];
            result[i+n] = arr[i];
        }
        return result;
    }
}
