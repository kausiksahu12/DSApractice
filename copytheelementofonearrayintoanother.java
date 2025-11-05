import java.util.Scanner;
public class copytheelementofonearrayintoanother {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        int[] arr2 = new int[n1];

        for(int i = 0;i<n1;i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < n1; i++) {
            System.out.print("The element of the array 1 :" + arr1[i]);
        }
        for(int i = 0;i<n1;i++) {
            arr2[i] = arr1[i];
        }

        for (int i = 0; i < n1; i++) {
            System.out.print("The element of the array 2:" +arr2[i]);
        }
    }
}
