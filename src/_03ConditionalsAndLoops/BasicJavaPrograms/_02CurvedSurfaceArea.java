package _03ConditionalsAndLoops.BasicJavaPrograms;

import java.util.Scanner;

public class _02CurvedSurfaceArea {
    public static void main(String[] args) {
//        Curved Surface Area Of Cylinder
// Formula = 2*pi * r * h;
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter radius: ");
        float radius = input.nextFloat();
        System.out.printf("Enter Height: ");
        float height = input.nextFloat();
        float pi = 22/7;

        float curvedSurfaceArea = 2 * pi * radius * height;
        System.out.printf("Curved Surface Area = " + curvedSurfaceArea);

    }
}
