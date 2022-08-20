package _02FirstJava;

import java.util.Scanner;

public class _06CurrencyConverter {
    public static void main(String[] args) {
//        Input currency in rupees and output in USD.
        Scanner input = new Scanner(System.in);

        System.out.printf("Enter currency in rupees: ");
        float rupees = input.nextFloat();
        float usd = rupees / 120;
        System.out.print("currency in USD is: " + usd);
    }
}
