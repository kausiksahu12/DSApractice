import java.util.Scanner;
public class Recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number for count the digit: ");
        int n = sc.nextInt();
        int count = countDigits(n);
        System.out.println("Number of digits: " + count);
    }

    public static int countDigits(int n) {
        if (n == 0) {
            return 1; 
        }
        if (n < 0) {
            n = -n; 
        }
        if (n < 10) {
            return 1;
        }
        return 1 + countDigits(n / 10);
    }
}
