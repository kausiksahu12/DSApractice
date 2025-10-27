import java.util.Scanner;
public class TempeartueAlert {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Temperature : ");
        int n = sc.nextInt();
        temp(n);
    
    }

    public static void temp(int n ) {
        if(n >= 30){
            System.out.println("Hot");

        }
        System.out.println("Remind the Same");

    }
    
}
