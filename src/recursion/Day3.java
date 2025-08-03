package recursion;

public class Day3 {
    public static void main(String[] args) {
       // System.out.println(skipApple("baccaappled"));
        System.out.println(Math.pow(2,3));
    }


    //2.Remove a particular String (ex. apple)
    static String skipApple(String str){
        if(str.isEmpty()){
            return "";
        }

        if(str.startsWith("apple")){
            return skipApple(str.substring(5));
        }else{
            return str.charAt(0) + skipApple(str.substring(1));
        }
    }

    //1. Remove an element approach 2
    static void skip(String str,String result){
        if(str.isEmpty()){
            System.out.println(result);
            return;
        }
        char ch = str.charAt(0);

        if(ch == 'a'){
            skip(str.substring(1),result);
        }else{
            skip(str.substring(1),result+ch);
        }
    }

    //1.remove all the As in a string
    static String removeAs(String str){
        return removeAsHelper(str,0,new StringBuilder());
    }

    private static String removeAsHelper(String str, int idx, StringBuilder result) {
        if(idx == str.length()){
            return result.toString();
        }

        if(str.charAt(idx) != 'a'){
            result.append(str.charAt(idx));
        }
        return removeAsHelper(str,idx+1,result);
    }
}
