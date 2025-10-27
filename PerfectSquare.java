import java.util.Scanner;
public class PerfectSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sq = Math.sqrt(n);
        if(sq==Math.floor(sq)){
            System.out.println("This is a Perfect SQ: " + n);
        } else {
            System.out.println("Here this is not perfect Square" + n);

        }

    }    
}
