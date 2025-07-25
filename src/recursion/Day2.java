package recursion;

public class Day2 {
    public static void main(String[] args) {
        System.out.println("RECURSION: Arrays");
        //System.out.println(checkSorted(new int[]{1,12,3,4,5},0));
       // System.out.println("found at index: "+ linearSearch(new int[]{43,12,56,23,167,32},32,0));
        int arr[] = {4,5,6,7,0,1,2};
        System.out.println(rbs(arr,0,0,arr.length-1));
    }

    //rotated binary search
    static int rbs(int arr[] ,int target,int s,int e){
        if(s > e){
            return -1;
        }
        int m = s + (e - s)/2;
        if(arr[m] == target){
            return m;
        }

        if(arr[s] <= arr[m]){
            //if true that means this array part is sorted
            if(target >= arr[s] && target <= arr[m]){
                //target lies in this sorted array
                return rbs(arr,target,s,m-1);
            }else{
                return rbs(arr,target,m+1,e);
            }
        }

        if(target >= arr[m] && target <= arr[e]){
            return rbs(arr,target,m+1,e);
        }
        return rbs(arr,target,s,m-1);
    }

    //linear search
    static int linearSearch(int[] arr,int target,int currentIdx){
        if(currentIdx > arr.length -1){
            return -1;
        }
        if(arr[currentIdx] == target){
            return currentIdx;
        }
        return linearSearch(arr,target,currentIdx+1);
    }


    //sorted check
    static boolean checkSorted(int[] arr, int index){
        if(index == arr.length -1){
            return true;
        }
        return arr[index] < arr[index+1] && checkSorted(arr,index+1);
    }
}
