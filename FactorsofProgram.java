import java.util.Scanner;
class FactorsofProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pls Enter the Number you want : ");
        int n = sc.nextInt();
        for(int i = 1; i<=n;i++) {
            if(n % i == 0) {
                System.out.println("The Factors are : " + i);
            }
        }
    }
}