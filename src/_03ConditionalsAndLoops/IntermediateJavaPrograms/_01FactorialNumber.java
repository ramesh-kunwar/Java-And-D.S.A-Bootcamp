package _03ConditionalsAndLoops.IntermediateJavaPrograms;

import java.util.Scanner;

public class _01FactorialNumber {
//    Factorial Program In Java
//the factorial of 6 is 1*2*3*4*5*6 = 720

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Enter a number: ");
        int num = input.nextInt();
        double factorial = 1;
        for (int i = 1; i<=num; i++){
            factorial = factorial * i;
        }
        System.out.println(factorial);
    }

}
