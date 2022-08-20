package _03ConditionalsAndLoops.BasicJavaPrograms;

import java.util.Scanner;

public class _05PrintUntilZero {
    public static void main(String[] args) {
//        Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)

// 1. TAKE USER INPUT
        Scanner input = new Scanner(System.in);
//        System.out.printf("Enter an integer number: ");

// 2. LOPOP UNTIL USER PRESS 0
        int num, sum = 0;
        do {
            System.out.printf("Enter an integer number: ");

            num = input.nextInt();
            sum += num;

        } while (num != 0);

        System.out.println("Sum = " + sum);

    }
}
