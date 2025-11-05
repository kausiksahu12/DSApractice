import java.util.Scanner;
public class reversetheelementinthearrayandprintthearray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for(int i=0; i<n1;i++) {
            arr1[i] = sc.nextInt();
        }
         for(int i = n1 - 1; i >= 0; i--) {
            System.out.println(arr1[i]);
        }
    }
}
