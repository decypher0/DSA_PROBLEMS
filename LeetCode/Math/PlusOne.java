package LeetCode.Math;

import java.math.BigInteger;
import java.util.Arrays;

public class PlusOne {

// You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

// Increment the large integer by one and return the resulting array of digits.

// Example 1:
// Input: digits = [1,2,3]
// Output: [1,2,4]
// Explanation: The array represents the integer 123.
// Incrementing by one gives 123 + 1 = 124.
// Thus, the result should be [1,2,4].

// Example 2:
// Input: digits = [4,3,2,1]
// Output: [4,3,2,2]
// Explanation: The array represents the integer 4321.
// Incrementing by one gives 4321 + 1 = 4322.
// Thus, the result should be [4,3,2,2].

// Example 3:
// Input: digits = [9]
// Output: [1,0]
// Explanation: The array represents the integer 9.
// Incrementing by one gives 9 + 1 = 10.
// Thus, the result should be [1,0].

    public int[] plusOne(int[] digits) {
        String n = "";
        for(int num : digits){
            n+=num;
        }
        BigInteger bigNum = new BigInteger(n);
        bigNum = bigNum.add(BigInteger.ONE);
        String resultString = bigNum.toString();
        int len = resultString.length();
        int[] result = new int[len];
        String[] resString = resultString.split("");
        for(int j=0;j<len;j++){
            result[j]=Integer.parseInt(resString[j]);
        }
        return result;
    }

    public static void main(String[] args) {
        PlusOne solver = new PlusOne();

        int[] test1 = {1, 2, 3};
        System.out.println("Test 1: Input: [1,2,3] | Expected: [1,2,4] | Result: " + Arrays.toString(solver.plusOne(test1)));

        int[] test2 = {4, 3, 2, 1};
        System.out.println("Test 2: Input: [4,3,2,1] | Expected: [4,3,2,2] | Result: " + Arrays.toString(solver.plusOne(test2)));

        int[] test3 = {9};
        System.out.println("Test 3: Input: [9]     | Expected: [1,0]   | Result: " + Arrays.toString(solver.plusOne(test3)));
    }
}