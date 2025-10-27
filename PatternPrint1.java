public class PatternPrint1 {
    public static void main(String[] args) {
         int n = 5; 
        for(int i = 1; i <= n; i++) {
            for(int j = n-1; j >= i; j--) {
                System.out.print(" ");
            }
            if(i == n) {
                for(int j = 1; j <= n; j++) {
                    System.out.print("* ");
                }
            } else {
                for(int j = 1; j <= 2*i -1; j++) {
                    if(j == 1 || j == (2*i -1)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
