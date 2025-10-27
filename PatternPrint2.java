public class PatternPrint2 {
    public static void main(String[] args) {
        for(int i = 1; i< 5;i++) {
            for(int j = 4;j>=i;j--) {
                System.out.println(" ");
            }

            for(int j = 1 ; j<= 2*i-1;j++){
                if(j == 1 || j == (2*i)-1) {
                    System.out.println("* ");
                } else {
                    System.out.println(" ");
                }
            }
            System.out.println();
        }

        for(int i = 2; i<=5;i++) {
            for(int j =2;j<=i;j++){
                System.out.println(" ");
            }
            for(int j =1;j<=11-(2*i);j++){
                if(j==1 || j == 11-(2*i)) {
                    System.out.println("*");
                } else {
                    System.out.println(" ");
                }
            }

            System.out.println();
        }
    }
}
