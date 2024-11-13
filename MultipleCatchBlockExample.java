package exceptionhandling;

import java.util.Scanner;

public class MultipleCatchBlockExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
        System.out.println("Enter two numbers to divide");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(num1/num2);

        String string = null;
        System.out.println(string.length());
        }
        catch(ArithmeticException e) {
            System.out.println("ArithmaticException: "+e.getMessage());
        }
        catch(NullPointerException e) {
            System.out.println("NullPointerException: "+e.getMessage());
        }
        catch(Exception e) {
            System.out.println("Generic Exception: "+e.getMessage());
        }
    }
}
