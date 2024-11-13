package exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArithmaticExceptionExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
        System.out.println("Enter the first number");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number");
        int num2 = sc.nextInt();
        System.out.println(num1/num2);
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        catch(InputMismatchException e) {
            System.out.println(e.getMessage()+": Enter the integer value.");
        }
    }
}
