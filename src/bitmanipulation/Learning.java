package bitmanipulation;

public class Learning {

    //get Bit
    private static void getBit(int number, int pos){
        int bitMask = 1 << pos;
        if((bitMask & number) == 0 ){
            System.out.println("Bit was 0");
        }else{
            System.out.println("Bit was 1");
        }
    }

    //set bit
    private static int setBit(int n, int pos){
        int mask = 1 << pos;
        return mask | n;
    }

    //clear bit
    private static int clearBit(int n, int pos){
        int bm = 1 << pos;
        int notBM = ~(bm);
        int result = notBM & n;
        return result;
    }
    public static void main(String[] args) {
        //getBit(5,1); // 0101
        //System.out.println(setBit(5,0)); // 0101
        System.out.println(clearBit(5,0)); // 0101
    }
}
