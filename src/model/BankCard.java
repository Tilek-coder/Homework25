package model;

import java.util.Scanner;

public class BankCard {
    private Scanner sc=new Scanner(System.in);
    private String numberCard;
    private String password;

    public BankCard() {
        setNumberCard();
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
    public void setNumberCard() {
        while (true) {
            System.out.print("Enter your card ID (16 digits): ");
            String inputCardId = sc.nextLine();
            if (inputCardId.length() == 16) {
                boolean isValid = true;
                for (int i = 0; i < inputCardId.length(); i++) {
                    if (!Character.isDigit(inputCardId.charAt(i))) {
                        isValid = false;
                        break;
                    }
                }
                if (isValid) {
                    numberCard = inputCardId;
                    System.out.println("Card ID successfully set.");
                    break;
                } else {
                    System.out.println("Card ID must contain only digits. Please try again.");
                }
            } else {
                System.out.println("Card ID must be 16 digits long. Please try again.");
            }
        }
    }
}
