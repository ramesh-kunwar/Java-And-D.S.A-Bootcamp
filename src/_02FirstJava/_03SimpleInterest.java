package _02FirstJava;

import java.util.Scanner;

public class _03SimpleInterest {
    public static void main(String[] args) {
//        Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter Principal, Time and Rate: ");

        int principal = input.nextInt();
        float time = input.nextFloat();
        float rate = input.nextFloat();

        double SI = (principal * time * rate) / 100;
        System.out.print("simple Interest is : " + SI);
    }
}
