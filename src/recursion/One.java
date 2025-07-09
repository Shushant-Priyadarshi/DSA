package recursion;

public class One {
    public static void main(String[] args) {
        //print(1);
        //System.out.println(fact(5));
        int arr[] = {2,15,16,32,56,76,89};
        int target = 56;
        System.out.println(search(arr,target,0,arr.length-1));
    }

    static int search(int arr[], int target, int start ,int end){
        if (start > end) {
            return -1;
        }
        int mid = start + (end-start)/2;

        if(arr[mid] == target){
            return mid;
        }

        if(arr[mid] > target){
            return search(arr,target,start,mid-1);
        }
        return search(arr,target,mid+1,end);
    }

    static  int fact(int n){
        if(n < 2){
            return  1;
        }
        return n * fact(n-1);
    }


    static void print(int n){
        if(n == 6){
            return;
        }
        System.out.println(n);
        print(n+1);
    }
}
