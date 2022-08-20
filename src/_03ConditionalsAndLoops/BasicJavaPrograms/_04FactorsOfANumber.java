package _03ConditionalsAndLoops.BasicJavaPrograms;

import java.util.Scanner;

public class _04FactorsOfANumber {
    public static void main(String[] args) {
//        Input a number and print all the factors of that number (use loops).
        Scanner input = new Scanner(System.in);

//        1. ENTER A NUMBER
        System.out.printf("Enter a number: ");
        int num = input.nextInt();

//        2. USE A LOOP FROM 0 TO A NUMBER
        for (int i = 1; i <= num; i++) {
            //        3. if number % i == 0 -> print i
            if (num % i == 0) {
                System.out.println(i);
            }
        }

    }
}
