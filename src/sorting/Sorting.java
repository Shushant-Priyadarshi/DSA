package sorting;

public class Sorting {
    //printing the array
    private static void printArray(int[] arr) {
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }

    //Selection Sort : select the minimum and swap
    static void SelectionSort(int[] arr){
        int n = arr.length;
        for(int i =0; i <=n-2 ;i++){
            int min =i;
            for(int j = i ; j<=n-1;j++){
                if(arr[j]<arr[min]) min = j;
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }

        printArray(arr);

    }

    //Bubble sort : pushing the maximum to the last by adjacent swapping
    static void BubbleSort(int[] arr){
        int n = arr.length;
        for(int i =n-1; i>=1;i--){
            for(int j=0 ; j< i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        printArray(arr);
    }

    //Insertion Sort
    static void InsertionSort(int[] arr){
        System.out.println("Insertion Sort");
    }

}
