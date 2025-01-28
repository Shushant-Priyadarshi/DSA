package basics.recursion;

import java.util.ArrayList;

public class Recursion {
    //+++++++++++++++++++++++++++++++++++++++++ Basic Theory +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

    /*Recursion => When a function calls itself again and again until a specific
     condition is met*/

    //Call stack and stack overflow:
//    When a function calls itself repeatedly without a proper stopping condition,
//    it keeps adding new function calls to a data structure called the call stack.
//    If the stack gets too full (because there are too many calls), the program runs
//    out of memory, and this is called a stack overflow.


    //+++++++++++++++++++++++++++++++++++++++++ Basic Problems Patterns +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

    // 1) Printing something n times :

        //Using BackTracking:
    public static void printName(int n){
        if(n!=0){
            System.out.println("Shushant");
            printName(n-1);
        }
    }

    public static void printName2(int i,int n){
        if(i >n) return;
        System.out.println("Shushant");
        printName2(i+1,n);
    }

    // 2) Print linearly from 1 to n
    public static void printNum(int n){
        if(n!=0){
            printNum(n-1);
            System.out.print(n+" ");
        }
    }

    // 3) Print linearly from n to 1
    public static void printNumBack(int n){
        if(n!=0){
            System.out.print(n+" ");
            printNumBack(n-1);
        }
    }

    //print the sum of the cube of consecutive numbers
    public static int printCubeOfNaturalNumbers(int n){
        if(n!=0){
            int num = printCubeOfNaturalNumbers(n-1);
            return num += n * n * n;
        }
        return 0;
    }

    //print the sum of n consecutive numbers
    public static int printSumOfNaturalNumbers(int n){
        if(n!=0){
            int num = printSumOfNaturalNumbers(n-1);
            return num += n;
        }
        return 0;
    }

    //print the factorail
    public static int factorial(int n){
        if(n!=0){
            int num = factorial(n-1);
            return num*n ;
        }
        return 1;
    }

    //helper function
    private static void  calcFactorial(long n,long factorial,long i,ArrayList<Long> result){
        if(factorial > n) return;
        result.add(factorial);
        calcFactorial(n,n*(i+1),i+1,result);
    }
    //main function
    public static ArrayList<Long> factorialNumebers(long n){
        ArrayList<Long> result = new ArrayList<>();
        calcFactorial(n,1,1,result);
        return result;
    }

//    //Reverse an array
//    public static void printTheArr(int arr[]){
//        if(arr.length !=0){
//            System.out.println(arr[arr.length-1]);
//            printTheArr(arr);
//        }
//
//    }





}
