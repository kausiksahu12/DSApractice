import java.util.Scanner;
public class SingledigitNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        while(n>=10){
            int sum = 0;
            while(n > 0) {
                sum += n % 10;
                n /= 10;
            }
            n = sum;
        }
        System.out.println("The Single Digit sum  of digit of temp :" + temp + " :" + n);

    }

}
