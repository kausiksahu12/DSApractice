import java.util.Scanner;
public class Palindromechacker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev = 0;
        int temp = n;
        while(n > 0){
            int reverse = n % 10;
            rev = rev * 10 + reverse;
            n /=10;
        }
        if(rev == temp) {
            System.out.println(temp + "  This is the palindrome");
        } else {
            System.out.println(temp  + "  This is not the palindrome.");
        }
    }
    
}
