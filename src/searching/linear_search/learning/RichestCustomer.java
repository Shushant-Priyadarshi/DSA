package searching.linear_search.learning;

//1672. Richest Customer Wealth
public class RichestCustomer {
    public static void main(String[] args) {
        int[][] accounts = {{2,8,7},{7,1,3},{1,9,5}};
        System.out.println(maximumWealth(accounts));
    }

    private static int maximumWealth(int[][] accounts) {
        int max = 0;
        for(int i=0 ; i<accounts.length ; i++){
            int sum = findSumOfAccount(accounts[i]);
            if(sum > max) max = sum;
        }
        return max;
    }

    private static int findSumOfAccount(int[] account) {
        int sum=0;
        for(int sal :account){
            sum += sal;
        }
        return sum;
    }
}
