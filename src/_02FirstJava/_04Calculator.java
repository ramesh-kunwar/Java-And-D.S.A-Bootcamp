package _02FirstJava;

import java.util.Scanner;

public class _04Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter Operator: ");
        char operator = input.next().trim().charAt(0);

        System.out.printf("Enter num1: ");
        float num1 = input.nextFloat();

        System.out.printf("Enter num2: ");
        float num2 = input.nextFloat();
        float result = 0;
        if (operator == '+') {
            result = num1 + num2;
        } else if (operator == '-') {
            result = num1 - num2;
        } else if (operator == '*') {
            result = num1 * num2;
        } else if (operator == '/') {
            result = num1 / num2;
        } else {
            System.out.println("Please enter a valid operator. ");
        }
        System.out.printf("Result is: " + result);
    }
}
