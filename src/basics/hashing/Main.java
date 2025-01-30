package basics.hashing;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int arr[] = {2, 3, 2, 3, 5};
        int arr2[] = {3,3,3,3};
        ArrayList<Integer> ans =Hashing.frequencyCount(arr2);
        System.out.println(ans);

    }
}
