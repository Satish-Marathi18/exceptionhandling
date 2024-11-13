package exceptionhandling;

import java.util.Scanner;

public class FinallyBlockDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer to divide");
        int number = sc.nextInt();
        try {
            System.out.println(100/number);
        }
        catch(ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Division operation is completed");
        }
    }
}
