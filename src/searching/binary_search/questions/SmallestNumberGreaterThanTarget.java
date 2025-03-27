package searching.binary_search.questions;

// Leetcode 744
public class SmallestNumberGreaterThanTarget {

    public static  char nextGreatestLetter(char[] letters, char target){
        int start = 0;
        int end = letters.length -1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(letters[mid] > target){
                end = mid -1 ;
            }else{
                start = mid +1;
            }
        }
        return letters[start % letters.length];
    }

    public static void main(String[] args) {
        char[] lettters = {'c','f','j'};
        char target = 'c';
        System.out.println(nextGreatestLetter(lettters,target));
    }
}
