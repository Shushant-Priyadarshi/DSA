package arrays.easy;

import java.util.ArrayList;
import java.util.List;

//1431
public class GreatestNumberOfCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> result = new ArrayList<>();
        int maxCandy = 0;

        //calculate the highest candy
        for(int candy : candies){
            maxCandy = Math.max(maxCandy,candy);
        }

        //compare that maxcandy with every candy+extracandy
        for(int candy: candies){
            result.add(candy+extraCandies >= maxCandy);
        }
        return result;


    }
}
