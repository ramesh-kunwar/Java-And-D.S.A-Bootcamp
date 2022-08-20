package _02FirstJava;

import java.util.Scanner;

public class _08PalindromeNumber {
    public static void main(String[] args) {
//        To find out whether the given String is Palindrome or not.
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter a number: ");
        int num = input.nextInt();
        int tempNum = num;
        int remainder = 0;
        int reversedNumber = 0;
        while(tempNum > 0){
            remainder = tempNum % 10;
            reversedNumber = (reversedNumber *10) + remainder;

            tempNum = tempNum / 10;
        }
        if (num == reversedNumber){
            System.out.println("It is a palindrome number.");
        }else{
            System.out.println("It is a not palindrome number.");

        }
    }
}
