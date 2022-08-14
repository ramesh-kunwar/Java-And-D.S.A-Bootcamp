package _02FirstJava;

import java.util.Scanner;

public class _01EvenOrOdd {
    public static void main(String[] args) {
//        Write a program to print whether a number is even or odd, also take input from the user.
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number = input.nextInt();

        if (number % 2 == 0) {
            System.out.println("It is even");
        } else {
            System.out.println("it is odd");
        }

    }
}
