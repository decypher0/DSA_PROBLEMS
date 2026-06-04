package LeetCode.Math;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PalindromeNumber {

    // Given an integer x, return true if x is a palindrome, and false otherwise.

    // Example 1:
    // Input: x = 121
    // Output: true
    // Explanation: 121 reads as 121 from left to right and from right to left.
    
    // Example 2:
    // Input: x = -121
    // Output: false
    // Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
    
    // Example 3:
    // Input: x = 10
    // Output: false
    // Explanation: Reads 01 from right to left. Therefore it is not a palindrome.

    public static boolean isPalindrome(int x) {
        // Edge cases:
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversedHalf = 0;
        int original = x;

        while (x > reversedHalf) {
            reversedHalf = reversedHalf * 10 + x % 10;
            x /= 10;
        }

        // For even digits: x == reversedHalf
        // For odd digits: x == reversedHalf / 10 (ignore middle digit)
        return x == reversedHalf || x == reversedHalf / 10;
    }

    public static void main(String[] args) {
        // Palindrome Verification
        System.out.println("isPalindrome(121)  | Expected: true  | Result: " + isPalindrome(121));
        System.out.println("isPalindrome(-121) | Expected: false | Result: " + isPalindrome(-121));
        System.out.println("isPalindrome(10)   | Expected: false | Result: " + isPalindrome(10));

        // Stream practice
        System.out.println("\n--- Stream Practice (Even numbers) ---");
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        nums.add(6);
        List<Integer> result = nums.stream().filter(n -> n%2 == 0).collect(Collectors.toList());
        for(Integer n : result){
            System.out.println(n);
        }
    }
}