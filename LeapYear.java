import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Year : ");
        int n = sc.nextInt();
        if(n % 400 == 0) {
            System.out.println("The year is leap year");
        } else if( n % 100== 0){
            System.out.println("The Year is not leap year.");
        } else if (n % 4 == 0) {
            System.out.println("The Year is leap year ");
        } else {
            System.out.println("The year is not a leap year .");
        }
    }
    
}
