package _03ConditionalsAndLoops.IntermediateJavaPrograms;

import java.util.Scanner;

public class _02ElectricityBill {
    public static void main(String[] args) {
//        Calculate Electricity Bill
/**
 Given an integer U denoting the amount of KWh units of electricity consumed,
 the task is to calculate the electricity bill with the help of the below charges:


 1 to 100 units – Rs. 10/unit
 100 to 200 units – Rs. 15/unit
 200 to 300 units – Rs. 20/unit
 above 300 units – Rs. 25/unit
 **/

        Scanner input = new Scanner(System.in);
        System.out.printf("Enter units consumed: ");
        float units = input.nextFloat();
        float total = 0;
        float amount = 0;

        if (units >= 1 && units < 100) {
            total = units * 10;

        } else if (units >= 100 && units < 200) {
            total = (100 * 10) + ((units - 100) * 15);
        } else if (units >= 200 && units < 300) {
            total = (100 * 10) +
                    (100 * 15) + ((units - 200) * 20);
        } else if (units >= 300) {
            total = (100 * 10) +
                    (100 * 15) +
                    (100 * 20) +
                    ((units - 300) * 25);
        }

        System.out.println(total);

    }
}
