package basics.recursion;

import java.util.ArrayList;

class Solution {

    // Recursive helper function
    static void findFactorials(long n, long factorial, int i, ArrayList<Long> result) {
        // Base condition: Stop recursion if factorial exceeds n
        if (factorial > n) return;
        // Add the current factorial to the result list
        result.add(factorial);
        // Calculate the next factorial and recurse
        findFactorials(n, factorial * (i + 1), i + 1, result);
    }

    // Main function to return the list of factorial numbers <= n
    static ArrayList<Long> factorialNumbers(long n) {
        ArrayList<Long> result = new ArrayList<>();

        // Start recursion with the first factorial (1)
        findFactorials(n, 1, 1, result);

        return result;
    }

}