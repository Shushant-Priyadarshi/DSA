package basics.patterns;

public class Patterns {
    public static void Square() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void Triangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void TriangleNumber(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void SameNumTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void ReverseTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void ReverseTriangleNumber(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void ReverseSameNumTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(n - i + 1 + " ");
            }
            System.out.println();
        }
    }

    public static void pyramid(int n) {
        for(int i =0 ;i<n;i++){
         //space
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
        // starr
            for(int j=0;j<i*2+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void ReversePyramid(int n) {
        for (int i = 0; i < n; i++) {
            // Spaces at the start of the row
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // Stars
            for (int j = 0; j < 2 * (n - i-1) + 1; j++) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();
        }
    }

    public static void diamond(int n) {
        pyramid(n);
        ReversePyramid(n);
    }


    public static  void halfKite(int n) {
        for(int i =1 ; i <= 2*n-1 ;i++){
            int stars = i;
            if(i>n) stars = 2*n-i;
            for(int j =1; j<=stars;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static  void NumberRightTriangle(int n) {
       int start = 1;
       for(int i=0 ; i<n ; i++){
           if(i%2==0) start =1;
           else start =0;
           for(int j=0;j<=i;j++){
               System.out.print(start+" ");
               start = 1-start;
           }
           System.out.println();
       }
    }





}
