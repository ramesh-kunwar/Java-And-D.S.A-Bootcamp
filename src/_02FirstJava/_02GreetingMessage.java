package _02FirstJava;

import java.util.Scanner;

public class _02GreetingMessage {
    public static void main(String[] args) {
        //    Take name as input and print a greeting message for that particular name.
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter your name: ");
        String name = input.nextLine();
        System.out.println("Hello " + name);
    }


}
