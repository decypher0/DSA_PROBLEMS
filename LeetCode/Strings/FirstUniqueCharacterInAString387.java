package LeetCode.Strings;

import javax.swing.text.html.parser.Entity;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;

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
//    Constraints:
//            1 <= s.length <= 105
//    s consists of only lowercase English letters.
    public int firstUniqueCharacterInAString(String s){
        int res = -1;
        LinkedHashMap<Character, Integer> charTable = new LinkedHashMap<>();
        for(int i = 0; i<s.length();i++){
            if(!charTable.containsKey(s.charAt(i))){
                charTable.put(s.charAt(i), 1);
            }else{
                charTable.put(s.charAt(i), charTable.get(s.charAt(i))+1);
            }
        }
        char resCharV = 0;
        if(charTable.containsValue(1)){
            for(Map.Entry<Character, Integer> c : charTable.entrySet()){
                if(c.getValue() == 1) {
                    resCharV = c.getKey();
                    break;
                }
            }
        }
        for(int i = 0;i<s.length();i++){
            if(resCharV==s.charAt(i))
                res = i;
        }
        return res;
    }

    public static void main(String[] args) {
        FirstUniqueCharacterInAString387 solver = new FirstUniqueCharacterInAString387();
        System.out.println(solver.firstUniqueCharacterInAString("dabbcb"));

    }
}
