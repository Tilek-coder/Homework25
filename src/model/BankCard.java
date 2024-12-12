package model;

import java.util.Scanner;

public class BankCard {
    private Scanner sc=new Scanner(System.in);
    private int numberCard;
    private String password;

    public BankCard() {

    }
    public void printCard(){
        System.out.println("You passed a check in, now buy something.");
    }
    public void setPassword(){
        System.out.print("Enter your password(any password that is 5 char length): ");
    }
}
