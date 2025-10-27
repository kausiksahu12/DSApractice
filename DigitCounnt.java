import java.util.Scanner;
public class DigitCounnt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt();
        int count = 0;
        int temp = n ;
        while (temp > 0 ) {
            count++;
            temp =temp / 10;
        }

        System.out.println(count);
        
    }
    
}
