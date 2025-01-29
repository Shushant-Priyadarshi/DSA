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

    //print the factorial
    public static int factorial(int n){
        if(n!=0){
            int num = factorial(n-1);
            return num*n ;
        }
        return 1;
    }

    //helper function
    private static void  calcFactorial(long n,long factorial,int i,ArrayList<Long> result){
        if(factorial > n) return;
        result.add(factorial);
        calcFactorial(n,factorial*(i+1),i+1,result);
    }
    //main function
    public static ArrayList<Long> factorialNumbers(long n){
        ArrayList<Long> result = new ArrayList<>();
        calcFactorial(n,1,1,result);
        return result;
    }

    //Reverse an array
        //using loops:
            public static int[] reverseArray(int[] arr){
                int start = 0;
                int end = arr.length-1;
                while(start<end){
                    int temp = arr[start];
                    arr[start] = arr[end];
                    arr[end] = temp;
                    start++;
                    end--;
                }
                return arr;
            }

//    //Using Recursion:
            // 1) using two pointers
            public static void reverseArrayRecursion(int[] arr){
                reverseHelper(arr,0,arr.length-1);
                for(int ele : arr)System.out.print(ele+" ");
            }

            private static void reverseHelper(int[] arr,int start,int end){
                if(start>=end)return;

                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                reverseHelper(arr,start+1,end-1);
            }

    // 2) using one pointer
        private static void reverseHelperOnePointer(int[] arr, int i){
            if(i>=arr.length/2) return;
            int temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
            reverseHelperOnePointer(arr,i+1);
        }
        public static void reverseOnePointer(int[] arr){
            reverseHelperOnePointer(arr,0);
            for(int ele : arr)System.out.print(ele+" ");
        }


    // Palindrome:

        private static String purifyString(String str){
            return str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        }
        private static boolean reverseString(String str,int i){
            if(i >= str.length()/2) return true;
            if(str.charAt(i)!=str.charAt(str.length()-i-1)) return false;
            return reverseString(str,i+1);
        }
        public static boolean isPalindrome(String s){
                String str =purifyString(s);
                return reverseString(str,0);
        }

    //Fibonacci series
        //printing using loops
    public static void printFibonacci(int n){
        int first = 0;
        int second = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            int nextTerm = first + second;
            first = second;
            second = nextTerm;
        }
    }
        //printing the value of f(n) if nth term is given:
            public static int fibonacci(int n){
                if(n==0) return 0;
                if(n==1) return 1;
                int first=0, second =1 ;
                for (int i = 2; i <= n; i++) {
                    int nextTerm = first + second;
                    first = second;
                    second = nextTerm;
                }
                return second;
            }
}
