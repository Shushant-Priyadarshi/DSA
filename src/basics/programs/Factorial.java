package basics.programs;

public class Factorial {
    public static  int factorial(int n) {
        int fact=1;
        for(int i=1; i<=n;i++){ //n=    1 2 3  4  5
            fact=fact*i;        //fact= 1 2 6  24 120

        }
        return fact; //120
    }
    public static void main(String[] args) {
        System.out.println("Factorial of 5 is: "+factorial(5) );
    }
}
