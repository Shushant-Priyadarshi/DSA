package basics.basic_maths;

public class Maths {

    //Digits Concept
    public static void extractNumber(int n) {
        while (n > 0) {
            System.out.println(n % 10); //extracting the last digit
            n = n / 10; //removing the last digit
        }
    }

    //count no.of digits
    public static int countDigits(int n) {
        int count = 0;
        int original = n;
        while (n > 0) {
            int lastDigit = n % 10;
            if (lastDigit != 0 && original % lastDigit == 0) count++;
            n /= 10;
        }
        return count;

    }

    //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    //Reverse
    //revNumber = (revNumber*10)+lastDigit
    public static int reverseDigits(int n) {
        int reversed = 0;
        int isReversed = n > 0 ? 1 : -1;
        n = Math.abs(n);

        while (n > 0) {
            int lastDigit = n % 10;
            reversed = reversed * 10 + lastDigit;
            n /= 10;
        }
        return reversed * isReversed;
    }


    public static int reverse(int x) {
        long ans = 0;

        while (x != 0) {
            ans = ans * 10 + x % 10;
            x /= 10;

        }
        return (ans < Integer.MIN_VALUE || ans > Integer.MAX_VALUE) ? 0 : (int) ans;
    }

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

    //Palindrome

    public static boolean Palindrome(int x) {
        if (x < 0) return false; // Negative numbers cannot be palindromes
        int reverse = 0;
        int original = x;
        while (x > 0) {
            reverse = reverse * 10 + x % 10;
            x = x / 10;
        }
        return reverse == original;
    }


}
