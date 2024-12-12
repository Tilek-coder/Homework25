package model;

import java.util.Scanner;

public class BankCard {
    private Scanner sc=new Scanner(System.in);
    private int numberCard;
    private String password;

    public BankCard() {
        setPassword();
    }
    public void printCard(){
        System.out.println("You passed a check in, now buy something.");
    }
    public void setPassword(){
        while (true) {
            System.out.print("Enter your password (any password that is 5 characters length): ");
            String inputPassword = sc.nextLine();
            if (inputPassword.length() == 5) {
                password = inputPassword;
                System.out.println("Password successfully set.");
                break;
            } else {
                System.out.println("Password must be 5 characters long. Please try again.");
            }
        }
    }
}
