import java.util.Scanner;
public class nPromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("The first " + n + " prime numbers are:");

        int count = 0;  
        int num = 2;    

        while (count < n) {
            if (isPrime(num)) {
                System.out.println(num);
                count++;
            }
            num++;
        }
    }
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}

