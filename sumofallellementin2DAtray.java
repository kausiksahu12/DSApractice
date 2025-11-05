import java.util.Scanner;
public class sumofallellementin2DAtray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int sum = 0;
        for(int[] array: arr) {
            for(int i : array) {
                sum +=i;
            }
        }
        System.out.println("Sum : " + sum);
    }
}
