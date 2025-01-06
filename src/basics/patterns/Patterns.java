package basics.patterns;

public class Patterns {
    public static void Square() {
        for(int i = 0; i< 4; i++){
            for(int j=0;j<4; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void Triangle(int n) {
        for(int i=0 ;i <n ;i++){
            for(int j=0 ; j <=i ; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
