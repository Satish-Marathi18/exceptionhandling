package exceptionhandling;

import java.util.Scanner;

public class PositiveNumberValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the positive number");
        int number = sc.nextInt();
        if(number >= 0){
            System.out.println("Positive number");
        }
        else{
            try {
                throw new NegativeNumberException("Negative number");
            }
            catch(NegativeNumberException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
