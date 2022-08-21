package _03ConditionalsAndLoops.BasicJavaPrograms;

import java.util.Scanner;

public class _06LargestAmongInputNumbers {
    public static void main(String[] args) {
//        Take integer inputs till the user enters 0 and print the largest number from all.

// STEP 1: TAKE INPUT NUMBERS UNTIL USER PRESS 0
        Scanner input = new Scanner(System.in);
        int[] num = new int[100];
        int greatest = num[0];
        for (int i = 0; i >= 0; i++) {
            System.out.printf("Enter integer: ");

            num[i] = input.nextInt();
            if (num[i] == 0) {
                break;
            }
            if (num[i] > greatest) {
                greatest = num[i];
            }
        }
        System.out.printf("Greatest = " + greatest);
    }
}
