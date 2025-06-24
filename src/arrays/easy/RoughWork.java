package arrays.easy;

import java.util.ArrayList;

public class RoughWork {

    static  int getNumbersInADigit(int num){
        String numStr = String.valueOf(num);
        return numStr.length();
    }

    static <T> void printArr( T[] arr){
        for(T num: arr){
            System.out.print(num+" ");
        }
    }

    public static void main(String[] args) {
       String [] sentence = {"alice and bob love leetcode",
                            "i think so too",
                            "this is great thanks very much"};
       String[] words= sentence[0].split(" ");
        System.out.println(words.length);


    }
}
