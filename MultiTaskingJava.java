import java.util.Scanner;
class Addition implements Runnable {
    public void run() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter The first Number for Addition: ");
    int a = sc.nextInt();
    System.out.println("Enter The Second Number for Addition: ");
    int b = sc.nextInt();
    int res  = a + b;
    System.out.println("The Result of this : " + res);
    }
}

class Subtraction implements Runnable {
    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number for Subtraction: ");
        int a = sc.nextInt();
        System.out.println("Enter The Second Number for Subtraction: ");
        int b = sc.nextInt();
        int res = a -b;
        System.out.println("The Result of this: " + res);
    }
}

class Multiplication implements Runnable {
    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number for Multiplication: ");
        int a = sc.nextInt();
        System.out.println("Enter The Second Number for Multiplication: ");
        int b = sc.nextInt();
        int res = a * b;
        System.out.println("The Result of this : " + res);
    }
}
public class MultiTaskingJava {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Addition());
        Thread t2 = new Thread(new Subtraction());
        Thread t3 = new Thread(new Multiplication());

        t1.start();
        t2.start();
        t3.start();

    }
    
}
