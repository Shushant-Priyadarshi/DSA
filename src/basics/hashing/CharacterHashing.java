package basics.hashing;

public class CharacterHashing {
    public static void main(String[] args) {
        String str = "abbbccccdddeff";
        System.out.println(freqCountChar(str,'b'));

    }

    private static int freqCountChar(String str,char target){
        int [] arr = new int[25];
        for(int i=0; i < str.length() ;i++){
            arr[str.charAt(i) -'a'] ++;
        }
        return arr[target -'a'];

    }
}
