package basics.basic_maths;

import java.util.Arrays;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        // Maths.extractNumber(3344);
//      System.out.println(Maths.countDigits(12));

//        System.out.println(Maths.reverse(-2312));
//        System.out.println(Maths.reverseDigits(-2312));
//        System.out.println(Maths.reverseDigits(-9845 %10));
//        System.out.println(Maths.Palindrome(1212));
 //      System.out.println(Maths.isArmstrong(371));
//      System.out.println(Maths.sumOfDivisors(4));
     // Maths.printAllDivisors(85);
     // System.out.println(Maths.isPrime(5));
       // Maths.printHCF(9,12);
       // Maths.EuclideanHCF(20,5);

        int[] ans =Maths.lcmAndGcd(14,8);
        System.out.println(Arrays.toString(ans));


    }
}
