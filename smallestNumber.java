import java.util.Scanner;
public class smallestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int smallest = 9;
        int temp = n1;
        while(temp >0) {
            int digit  = temp % 10;
            if(digit < smallest) {
                smallest = digit;
            } 
            temp  = temp / 10;
        }
        System.out.println("The Number is : " + n1 + " : "+ smallest);
    }
    
}
