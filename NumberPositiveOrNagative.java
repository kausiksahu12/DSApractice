import java.util.Scanner;
class NumberPositiveOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter a Number : ");
        int n = sc.nextInt();
        if(n >=0) {
            System.out.println("The Number is Positive.");
        }   else {
            System.out.println("The Number is Negative.");
        }
    }
}