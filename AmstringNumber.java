import java.util.Scanner;
public class AmstringNumber {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
      
		int count= 0;
		int original = number;
		int temp = number;
		while (temp > 0) {
			count++;
			temp /= 10;
		}
		
		int sum = 0;
		temp = number;
		while(temp != 0) {
			int digit = temp%10;
			int p = 1;
			for(int i =0 ;i <count; i++) {
				p*= digit;
			}
			sum +=p;
			temp /= 10;
		}
		if(sum== original) {
			System.out.println(original + " is an Armstrong number.");
		}
		else {
			System.out.println(original + " is not an Armstrong number.");
		}
	}

}
