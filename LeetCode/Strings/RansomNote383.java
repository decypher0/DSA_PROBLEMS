package LeetCode.Strings;

import java.util.Hashtable;
import java.util.Map;

public class RansomNote383 {
//    Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.
//
//    Each letter in magazine can only be used once in ransomNote.
//
//            Example 1:
//    Input: ransomNote = "a", magazine = "b"
//    Output: false
//    Example 2:
//
//    Input: ransomNote = "aa", magazine = "ab"
//    Output: false
//    Example 3:
//
//    Input: ransomNote = "aa", magazine = "aab"
//    Output: true
//    Constraints:
//            1 <= ransomNote.length, magazine.length <= 105
//    ransomNote and magazine consist of lowercase English letters.
    public boolean canConstruct(String ransomNote, String magazine){
        Hashtable<Character, Integer> ransomTable = new Hashtable<>();
        Hashtable<Character, Integer> magazineTable = new Hashtable<>();
        int maxLen = 0;
        if(ransomNote.length() > magazine.length())
            maxLen = ransomNote.length();
        else
            maxLen = magazine.length();
        int i = 0;
        while(maxLen -- > 0){
            if(i < ransomNote.length()){
                if(!ransomTable.containsKey(ransomNote.charAt(i))){
                    ransomTable.put(ransomNote.charAt(i), 1);
                }else{
                    ransomTable.put(ransomNote.charAt(i), ransomTable.get(ransomNote.charAt(i))+1);
                }
            }
            if(i < magazine.length()){
                if(!magazineTable.containsKey(magazine.charAt(i))){
                    magazineTable.put(magazine.charAt(i), 1);
                }else{
                    magazineTable.put(magazine.charAt(i), magazineTable.get(magazine.charAt(i))+1);
                }
            }
            i++;
        }
        boolean res = false;
        for(Map.Entry<Character, Integer> entry : ransomTable.entrySet()){
            if(magazineTable.containsKey(entry.getKey()) && magazineTable.get(entry.getKey()) >=ransomTable.get(entry.getKey()))
                res = true;
            else
                break;
        }
        return res;
    }
    public static void main(String[] args) {
        RansomNote383 ransomNote383 = new RansomNote383();
        System.out.println(ransomNote383.canConstruct("az", "ab"));
    }
}
