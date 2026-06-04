package Arryas;

import java.util.Arrays;

public class MissingNumber268 {
    //     Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.

    // Example 1:
    // Input: nums = [3,0,1]
    // Output: 2

    // Example 2:
    // Input: nums = [0,1]
    // Output: 2

    // Example 3:
    // Input: nums = [9,6,4,2,3,5,7,0,1]
    // Output: 8
    
    public int missingNumber(int[] nums) {
        int n = nums.length;
        // Calculate the expected sum of numbers from 0 to n
        int expectedSum = n * (n + 1) / 2;
        //2*(3)/2 = 2*1 = 2
        // Calculate the actual sum of numbers in the array
        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }
        // The missing number is the difference between the expected sum and the actual sum
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        MissingNumber268 solver = new MissingNumber268();

        int[] test1 = {3, 0, 1};
        System.out.println("Test 1: Input: [3,0,1] | Expected: 2 | Result: " + solver.missingNumber(test1));

        int[] test2 = {1, 2};
        System.out.println("Test 2: Input: [0,1]   | Expected: 2 | Result: " + solver.missingNumber(test2));

        int[] test3 = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        System.out.println("Test 3: Input: [9,6,4,2,3,5,7,0,1] | Expected: 8 | Result: " + solver.missingNumber(test3));
    }
}