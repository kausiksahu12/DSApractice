import java.util.Scanner;
public class DecimalToBinaray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        String  binary = " ";
        while(n>0) {
            int digit = n % 2;
            binary = digit + binary;
            n /= 2;
        }

        System.out.println("Here the binary is : " + temp + " : " + binary);
    }

    
}
