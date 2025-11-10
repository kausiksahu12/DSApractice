import java.util.Scanner;
public class PrintZigzagArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();

        int arr[][] = new int[row][column];
        for(int i = 0; i<row;i++) {
            for(int j=0;j<column;j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        // ZigZag
        for(int j=0;j<arr[0].length;j++) {
            if(j%2==0) {
                for(int i = 0;i<arr.length;i++) {
                    System.out.println(arr[i][j]);
                }
            }
            else{
                for(int i=arr.length-1;i>0;i++){
                    
                }
            }
        }

    }
}
