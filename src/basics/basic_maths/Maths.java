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

//+++++++++++++++++++++++++++++++++++++++++ Armstrong +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

    public static boolean isArmstrong(int x) {
        if (x < 0) return false;
        int original = x;
        int armstrong = 0;
        while (x != 0) {
            int lastDigit = x % 10;
            armstrong += lastDigit * lastDigit * lastDigit;
            x = x / 10;
        }
        return armstrong == original;
    }


    //+++++++++++++++++++++++++++++++++++++++++ print all divisor +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    public static void printAllDivisors(int n) {
            System.out.print("Divisors of " + n + " => ");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }

    }

    public static int sumOfDivisors(int n) {
        int sum = 0;
       for(int i=1; i<=n; i++) {
           for(int j=1; j<=i ;j++){
               if(i%j==0){
                   sum += j;
               }
           }
       }
       return sum;
    }
    //+++++++++++++++++++++++++++++++++++++++++ prime numbers +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

    public static boolean isPrime(int x) {
        if(x <= 1) return false;
        for(int i=2; i*i <=x ; i++){
            if(x % i == 0) return false;
        }
        return true;

    }

    //+++++++++++++++++++++++++++++++++++++++++ HCF +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

    public static void printHCF(int n1,int n2){
        int hfc;
        for(int i= Math.min(n1,n2) ; i>=1; i--){
            if(n1 % i == 0 && n2 % i == 0){
                System.out.println("HCF " + n1 + " and " + n2 + " is: "+ i);
                break;
            }
        }
    }
    //+++++++++++++++++++++++++++++++++++++++++ Euclidean Algorithm+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

        public static void EuclideanHCF(int n1 ,int n2){
            // hcf(n1,n2) = hcf(n1%n2,n2) [n1 > n2] till one of them becomes 0

            while( n1 > 0 && n2 > 0){
                if(n1 > n2){
                    n1 = n1 % n2;
                }else{
                    n2 = n2 % n1;
                }

            }
            if(n1 == 0) System.out.println("Euclidean HCF is: "+ n2);
            else System.out.println("Euclidean HCF " + n2 + " is: "+ n1);

    }
}
