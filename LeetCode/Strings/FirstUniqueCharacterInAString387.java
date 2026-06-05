package LeetCode.Strings;

public class FirstUniqueCharacterInAString387 {
//    Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
//
//
//
//    Example 1:
//
//    Input: s = "leetcode"
//
//    Output: 0
//
//    Explanation:
//
//    The character 'l' at index 0 is the first character that does not occur at any other index.
//
//    Example 2:
//
//    Input: s = "loveleetcode"
//
//    Output: 2
//
//    Example 3:
//
//    Input: s = "aabb"
//
//    Output: -1
//
//
//
//    Constraints:
//
//            1 <= s.length <= 105
//    s consists of only lowercase English letters.
    public int firstUniqueCharacterInAString(String s){
        char a = s.charAt(0);
        int b = 0;
        for(int i = b; i<s.length();i++){
            if(a==s.charAt(i)){
                a = s.charAt(i);
                b++;
            }
        }
        return b >= 0 ? b : -1;
    }

    public static void main(String[] args) {
        FirstUniqueCharacterInAString387 solver = new FirstUniqueCharacterInAString387();
        System.out.println(solver.firstUniqueCharacterInAString("leetcode"));

    }
}
