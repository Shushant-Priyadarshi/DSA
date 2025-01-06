package basics.patterns;

public class Patterns {
    public static void Square() {
        for(int i = 0; i< 4; i++){
            for(int j=0;j<4; j++){
                System.out.print("* ");
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

    public static void TriangleNumber(int n){
        for(int i=1; i<=n ;i++){
            for(int j=1 ; j<=i ;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void SameNumTriangle(int n){
        for(int i=1 ; i<=n ;i++){
            for(int j =1 ; j<=i ; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    public static void ReverseTriangle(int n){
        for(int i =0; i<n;i++){
            for(int j=0; j< n-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void ReverseTriangleNumber(int n){
        for(int i=0 ; i <n ; i++){
            for(int j=1 ; j<=n-i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
