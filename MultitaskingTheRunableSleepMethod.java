import java.util.Scanner;
class Addition implements Runnable {
    public void run() {
        try {
            Thread.sleep(100);
            Scanner sc = new Scanner(System.in);
            System.out.println("=== Addition====");
            System.out.println("Enter the First Number for the Addition: ");
            int a = sc.nextInt();
            System.out.println("Enter the Second Number for the Addition: ");
            int b = sc.nextInt();
            int res = a + b;
            System.out.println("Here The result : " + res);
        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}

class Subtraction implements Runnable {
    public void run() {
        try {
            Thread.sleep(100);
            Scanner sc = new Scanner(System.in);
            System.out.println("=== Addition====");
            System.out.println("Enter the First Number for the Subtraction: ");
            int a = sc.nextInt();
            System.out.println("Enter the Second Number for the Subtraction: ");
            int b = sc.nextInt();
            int res = a - b;
            System.out.println("Here The result : " + res);
        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}

class Multiplication implements Runnable {
    public void run() {
        try {
            Thread.sleep(100);
            Scanner sc = new Scanner(System.in);
            System.out.println("=== Addition====");
            System.out.println("Enter the First Number for the Multiplication: ");
            int a = sc.nextInt();
            System.out.println("Enter the Second Number for the Multiplication: ");
            int b = sc.nextInt();
            int res = a * b;
            System.out.println("Here The result : " + res);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class MultitaskingTheRunableSleepMethod {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Addition());
        Thread t2 = new Thread(new Subtraction());
        Thread t3 = new Thread(new Multiplication());


        try {
            t1.start();
            Thread.sleep(500);
            t2.start();
            Thread.sleep( 500);
            t3.start();
            
        } catch (Exception e) {
            e.printStackTrace();
        }

        
    }
    
}
