import java.util.Scanner;
public class GCDNUMBER {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int gcd = findgcd(n1,n2);
        System.out.println("The GCD is : " + n1 + " , " + n2 + ": " + gcd);
    }

    public static int findgcd(int a, int b) {
    while(b!=0) {
        int temp  = b;
        b = a % b;
        a = temp;
    }        
     return a;
    }
}
