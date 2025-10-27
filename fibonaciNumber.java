import java.util.Scanner;
public class fibonaciNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
    }

    public static void fibonaci(int n) {
        int a = 0;
        int b = 1;

        System.out.println("The Fibonbaci series up to :" + n + ": ");

        if(a<=n) System.out.print(a + " ");
        if(b <=n) System.out.print(b + " ");
        int next = a+b;
        while(next <= n) {
            System.out.println(next + " ");
            int n1 = a+b;
            a=b;
            b = next;
            next = a+b;

        }
        System.out.println();
    }
}
