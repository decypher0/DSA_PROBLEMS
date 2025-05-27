package NeedCode150;

public class findDuplicateNumber {
//    You are given an array of integers nums containing n + 1 integers. Each integer in nums is in the range [1, n] inclusive.
//
//    Every integer appears exactly once, except for one integer which appears two or more times. Return the integer that appears more than once.
//
//    Example 1:
//
//    Input: nums = [1,2,3,2,2]
//
//    Output: 2
//    Example 2:
//
//    Input: nums = [1,2,3,4,4]
//
//    Output: 4
//    Follow-up: Can you solve the problem without modifying the array nums and using
//    O
//            (1)
//    O(1) extra space?
public static void main(String[] args) {
//    int[] nums = {1,2,3,2,2};
//int result = findDuplicateNumber(nums);
    String s = "leetcode", p = "ee*e";
    System.out.println(hasMatch(s, p));
}
    public static boolean hasMatch(String s, String p) {
        boolean result = false;
        if(!p.contains("*"))
            return false;
        String regex = p.replace("*", ".*");
        java.util.regex.Pattern compiledPattern = java.util.regex.Pattern.compile(regex);
        java.util.regex.Matcher matcher = compiledPattern.matcher(s);

        if (matcher.find()) {
            result = true;
        }
       return result;

    }
}
