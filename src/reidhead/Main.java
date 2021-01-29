package reidhead;

import java.util.Scanner;

public class Main {
    private static final Scanner userInput = new Scanner(System.in);
    public static void main(String[] args) {
        String UserName;

        System.out.println("Please input your name: ");
        UserName = userInput.nextLine();

        System.out.println("Hello "+UserName+" welcome to the new you!");
        System.out.println("Hello Joe, my name is Sam.");
        System.out.println("Hello Joe, my name is Fabrice.");
    }
}
