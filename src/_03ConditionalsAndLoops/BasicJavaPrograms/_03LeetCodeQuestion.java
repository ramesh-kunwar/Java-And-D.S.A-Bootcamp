package _03ConditionalsAndLoops.BasicJavaPrograms;

public class _03LeetCodeQuestion {
    public static void main(String[] args) {
//        https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/

        /**
         //        Given an integer number n, return the difference between the product of its digits and the sum of its digits.

         Example 1:

         Input: n = 234
         Output: 15
         Explanation:
         Product of digits = 2 * 3 * 4 = 24
         Sum of digits = 2 + 3 + 4 = 9
         Result = 24 - 9 = 15

         Example 2:

         Input: n = 4421
         Output: 21
         Explanation:
         Product of digits = 4 * 4 * 2 * 1 = 32
         Sum of digits = 4 + 4 + 2 + 1 = 11
         Result = 32 - 11 = 21
         **/
        int n = 234;
        int temp = n;

//        STEP 1: FIND THE PRODUCT A NUMBER 234 -> 24
        //    a) find no of digits
        int count = 0;
        while (temp > 0) {
            count++;
            temp /= 10;
        }
//             b) multiply each digit
//                    i. find remainder
        int remainder = 0, product = 1, sum = 0;
        for (int i = 0; i < count; i++) {
            remainder = n % 10;
            product *= remainder;

//            finding sum of its digit (n)
            sum += remainder;
            n /= 10;
        }
        //        STEP 3: SUBTRACT PRODUCT AND SUM

        int difference = product - sum;
        System.out.printf("Difference = " + difference);


    }
}
