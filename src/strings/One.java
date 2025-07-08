package strings;

public class One {
    public static void main(String[] args) {
        String str = "abcdcba";
        //System.out.println(isPalindrome(str));
        System.out.println(isPalindrome("racecar"));  // true
        System.out.println(isPalindrome("madam"));    // true
        System.out.println(isPalindrome("hello"));    // false
    }

    private static boolean isPalindrome(String str) {
        int first = 0;
        int last = str.length() -1;

        while(first < last){
            if(str.charAt(first) != str.charAt(last)){
                return false;
            }
            first++;
            last--;
        }
        return true;
    }

    private static int[] arr(){
        return new int[]{3,4};
    }
}
