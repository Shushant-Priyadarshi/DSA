package recursion;

public class Lvl1 {

    public static void main(String[] args) {
        System.out.println("LVL 1");
        System.out.println(countZeros(30045002,0));
    }

    static int countZeros(int n,int counter){
        if(n==0) return counter;
        int ld = n % 10;
        if(ld==0){
            counter++;
        }
        return countZeros(n/10,counter);
    }

    static void printReverse(int n){
        if(n == 0){
            return;
        }
        int ld = n % 10;
        System.out.print(ld);
        printReverse(n/10);
    }

    static int sumOfDigits(int n){
        if(n%10 == n)return n;
        int ld = n %10;
        return ld + sumOfDigits(n/10);
    }


    static int sumRec(int n){
        if(n <=1){
            return 1;
        }
        return n + sumRec(n-1);
    }

    static int factorail(int n){
        if(n <=1){
            return 1;
        }
        return n * factorail(n-1);
    }

    static void OneToN(int n){
        if(n <=0){
            return;
        }
        OneToN(n-1);
        System.out.print(n+" ");

    }



    static void Nto1(int n){
        if(n <=0){
            return;
        }
        System.out.print(n+" ");
        Nto1(n-1);
    }
}
