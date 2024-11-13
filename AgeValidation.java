package exceptionhandling;

import java.util.Scanner;

public class AgeValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter the age");
            int age = sc.nextInt();
            if (age > 21) {
                System.out.println("Valid Age.");
            }
            else {
                try {
                    throw new InvalidAgeException("Invalid Age");
                }
                catch(InvalidAgeException e){
                    System.out.println(e.getMessage());
                }
            }
    }
}
