import java.util.Scanner;
public class SwitchcaseIMplementationDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number for the Day: ");
        int n = sc.nextInt();
        day(n);
    }

    public static void day(int n ) {
        switch(n) {
            case 1 -> System.out.println("Monday.");
            case 2 -> System.out.println("Tuesday.");
            case 3 -> System.out.println("Wedness Day.");
            case 4 -> System.out.println("Thursday.");
            case 5 -> System.out.println("Friday.");
            case 6 -> System.out.println("Saturday.");
            case 7 -> System.out.println("Sunday.");
            default -> System.out.println("Invalid ");
        }
    }
    
}
