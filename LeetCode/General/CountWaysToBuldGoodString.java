public class CountWaysToBuldGoodString {
//    Given the integers zero, one, low, and high, we can construct a string by starting with an empty string, and then at each step perform either of the following:
//
//    Append the character '0' zero times.
//    Append the character '1' one times.
//    This can be performed any number of times.
//
//    A good string is a string constructed by the above process having a length between low and high (inclusive).
//
//    Return the number of different good strings that can be constructed satisfying these properties. Since the answer can be large, return it modulo 109 + 7.
//
//
//
//    Example 1:
//
//    Input: low = 3, high = 3, zero = 1, one = 1
//    Output: 8
//    Explanation:
//    One possible valid good string is "011".
//    It can be constructed as follows: "" -> "0" -> "01" -> "011".
//    All binary strings from "000" to "111" are good strings in this example.
//            Example 2:
//
//    Input: low = 2, high = 3, zero = 1, one = 2
//    Output: 5
//    Explanation: The good strings are "00", "11", "000", "110", and "011".
    public static void main(String[] args){
        int low = 3;
        int high = 3;
        int zero = 1;
        int one = 1;
        long goodString = constructGoodString(low, high, zero, one);
        System.out.print(goodString);
    }

    private static long constructGoodString(int low, int high, int zero, int one){
        int count = 0;
        String oneString = "";
        while(oneString.length()<=one){
            oneString+="1";
        }
        String zeroString = "";
        while(zeroString.length()<=zero){
            zeroString+="0";
        }
        String startString = zeroString;
        if(zero <= low) {
            while(startString.length()==low){
                startString+=zeroString;
            }
            count++;
        }
        String endString  = oneString;
        if(one >= high){
//            while (high<= endString.length())
        }
        return 0;
    }
}
