package searching.linear_search;

public class EvenDigits {
    //Find Numbers with Even Number of Digits
    static int findNumberOfDigit(int num){
        int noOfDigits=0;
        while(num!=0){
            num /= 10;
            noOfDigits++;

        }
        return noOfDigits;
    }

    static int findEvenDigitCount(int [] arr){
        int ans = 0;
        for(int i : arr){
            if(findNumberOfDigit(i) % 2 == 0){
                ans++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {12,345,2,6,7896};
        System.out.println(findEvenDigitCount(arr));

    }
}
