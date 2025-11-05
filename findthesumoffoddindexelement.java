import java.util.Scanner;
public class findthesumoffoddindexelement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] arr = new int[n1];
        for(int i = 0;i<n1;i++) {
            arr[i] = sc.nextInt();
        }      
        int sum = 0;

        // sum of odd index elements
        for(int i = 1; i < n1; i += 2) {
            sum += arr[i];
        }

        System.out.println(sum);
    }
}
