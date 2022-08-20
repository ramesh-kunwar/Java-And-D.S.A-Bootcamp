package _02FirstJava;

import java.util.Scanner;

public class _07FibonacciSeries {
    public static void main(String[] args) {
//        To calculate Fibonacci Series up to n numbers.
//        0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181 up to n
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter nth number: ");
        int n = input.nextInt();
        int a = 0;

        int b = 1;
        System.out.println(a);
        System.out.println(b);
        for (int i = 2; i <= n; i++) {
            int c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }
    }
}
