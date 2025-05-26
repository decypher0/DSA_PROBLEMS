public class FindIndexOfFirstOccuranceInAString {
//    Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
//
//
//
//    Example 1:
//
//    Input: haystack = "sadbutsad", needle = "sad"
//    Output: 0
//    Explanation: "sad" occurs at index 0 and 6.
//    The first occurrence is at index 0, so we return 0.
//    Example 2:
//
//    Input: haystack = "leetcode", needle = "leeto"
//    Output: -1
//    Explanation: "leeto" did not occur in "leetcode", so we return -1.
    public static void main(String[] args){
        String haystack = "mississippi";
        String needle = "issip";
        int occurance = findOccuranceInString(haystack, needle);
        System.out.print(occurance);
    }

    private static int findOccuranceInString(String haystack, String needle){
        int k = 0;
        if(haystack.contains(needle)){
            for(int i=0;i<haystack.length();i++){
                if(needle.charAt(0)==haystack.charAt(i)){
                    int j = 0;
                    boolean isStringOkay = false;
                    while(j<needle.length()){
                        if(needle.charAt(j)==haystack.charAt(i+j)){
                            j++;
                            isStringOkay=true;
                        }else{
                            isStringOkay = false;
                            break;
                        }
                    }
                    if(isStringOkay) {
                        k = i;
                        break;
                    }
                }
            }
        }else{
            k=-1;
        }
        return k;
    }
}
