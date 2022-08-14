package _02FirstJava;

import java.util.Scanner;

public class _05LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter Num 1: ");
        int num1 = input.nextInt();
        System.out.printf("Enter Num 2: ");
        int num2 = input.nextInt();

        if (num1 > num2) {
            System.out.println("Num 1 is greatest.");
        } else {
            System.out.println("Num 2 is greatest.");
        }
    }
}
