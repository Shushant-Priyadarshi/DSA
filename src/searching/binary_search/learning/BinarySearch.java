package searching.binary_search.learning;

public class BinarySearch {

    static int binarySearch(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
           int mid = start+ (end-start)/2;
           if(arr[mid] > target){
               end = mid-1;
           }else if (arr[mid]< target){
               start =mid+1;
           }else {
               return mid;
           }
        }
        return -1;
    }

    static int orderAgnoisticBinarySearch(int[] arr ,int target){
        int start = 0;
        int end = arr.length-1;

        //find if the array is asc or desc
        boolean isAsc = arr[start] < arr[end];

        //main loop
        while(start <= end){
            int mid = start + (end-start)/2;

            if(arr[mid] == target) return mid;

            if(isAsc){
                if(arr[mid] < target){
                    start = mid+1;
                }else{
                    end = mid-1;
                }
            }else{
                if(arr[mid] > target){
                    start = mid+1;
                }else{
                    end = mid-1;
                }
            }
        }

        return -1;
    }


    public static void main(String[] args) {
        int[] arr= {2,4,6,9,11,12,14,20,36};
        int target = 36;
        System.out.println(binarySearch(arr,target));
        System.out.println(2 % 4);
    }
}
