import java.util.Scanner;
public class PrinttheoddnumberusingDowhileloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        do{
            if(i % 2 !=0){
                System.out.println(i);
            }
            i++; 
        } 
        while(i<=n);
    }
}
