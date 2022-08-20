package _03ConditionalsAndLoops.BasicJavaPrograms;

import java.util.Scanner;

public class _01AreaOfCircle {
    public static void main(String[] args) {
//        Area Of Circle Java Program
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter radius: ");
        float radius = input.nextFloat();
        float pi = 22/ 7;
        float areaOfCircle = pi * radius * radius;
        System.out.printf("Area of circle = "+ areaOfCircle);



    }
}
