import java.util.Scanner;
public class FindthesumofelementinArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] arr = new int[n1];
        for(int i = 0; i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i = 0; i<arr.length;i++) {
            sum += arr[i];
        }
        System.out.println("The sum of element is : " + sum);

    
    }
}
