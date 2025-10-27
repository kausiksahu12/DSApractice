import java.util.Scanner;
public class YouAdult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age: ");
        int n = sc.nextInt();
        adultage(n);
    }

    public static void adultage (int n ) {
        if(n > 18) {
            System.out.println("You  adult.");
        } else {
            System.out.println("You  not adult.");
        }
    }
    
}
