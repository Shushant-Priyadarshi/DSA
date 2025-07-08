package searching;

public class Test {
    public static void main(String[] args) {
        int [] arr = {3,6,7,11};
        int totalSpeed= minEatingSpeed(arr,8);
        System.out.println(totalSpeed);
    }
    public static int minEatingSpeed(int[] piles, int h) {
        //assume the min and max speed
        int minSpeed = 1;
        int maxSpeed = findMaxSpeed(piles);

        //apply binary search
        while(minSpeed <= maxSpeed){
            //find the mid speed
            int midSpeed= minSpeed + (maxSpeed - minSpeed)/2;

            //calculate the total eating time with the mid speed
            if(totalTimeWithCurrentMidSpeed(piles,midSpeed,h) ){
                // found out that the total time taken <= h
                // speed --
                maxSpeed = midSpeed -1;
            }else {
               //total time > h
                //speed ++
                minSpeed = midSpeed +1;
            }
        }

        return minSpeed;

    }

     static  int findMaxSpeed(int[] arr){
        int max = 0;
        for(int ele: arr){
            max = Math.max(ele,max);
        }
        return max;
    }

    static boolean totalTimeWithCurrentMidSpeed(int[] arr, int speed, int hour){
        long totalTimeTaken = 0;
        for(int ele: arr){
            totalTimeTaken += (int)Math.ceil((double)ele/speed);
        }
        return totalTimeTaken <= hour;
    }


}
