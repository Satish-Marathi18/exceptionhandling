package exceptionhandling;

import java.util.Scanner;

public class BankManagement {
    static int balance = 1000;

    static void withdraw(int amt) {
        if(amt <= balance){
            System.out.println("Amount withdraw succesfully");
            balance = balance-amt;
            System.out.println(balance);
        }
        else {
            try{
                throw new InsufficientFundsException("Insufficient amount to withdraw");
            }
            catch(InsufficientFundsException e){
                System.out.println(e.getMessage());
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount to withdraw");
        int amt = sc.nextInt();
        withdraw(amt);
        withdraw(amt);
    }
}
