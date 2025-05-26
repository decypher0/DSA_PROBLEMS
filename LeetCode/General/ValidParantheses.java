import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ValidParantheses {
//    Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
//    An input string is valid if:
//    Open brackets must be closed by the same type of brackets.
//    Open brackets must be closed in the correct order.
//    Every close bracket has a corresponding open bracket of the same type.
//    Example 1:
//    Input: s = "()"
//    Output: true
//    Example 2:
//    Input: s = "()[]{}"
//    Output: true
//    Example 3:
//    Input: s = "(]"
//    Output: false
//    Example 4:
//    Input: s = "([])"
//    Output: true
private static boolean isValid(String s) {
    boolean result = true;
    if(s.length() % 2 != 0){
        result = false;
    } else if(s.charAt(0) == ')' || s.charAt(0) == ']' || s.charAt(0) == '}'){
        result = false;
    }else{
        boolean end = false;
        while(!end){
            if(s.contains("()") || s.contains("[]") || s.contains("{}")){
                s=s.replace("()", "");
                s=s.replace("[]", "");
                s=s.replace("{}", "");
            }else if(s.isEmpty()){
                break;
            }else{
                result=false;
                end=true;
            }
        }
    }
    return result;
}
    public static void main(String[] args) {
        Scanner inp =  new Scanner(System.in);
        String s = inp.nextLine();
        boolean result = isValid(s);
        System.out.println(result);
            //2nd approch - not enough
//            int i= 0;
//            int j=s.length()-1;
//            while(i<j){
//                if(s.charAt(i)=='('){
//                    if(s.charAt(i+1)==')'){
//                        i=i+2;
//                    }else if(s.charAt(j)==')'){
//                        i=i+1;
//                        j=j-1;
//                    }else {
//                        int m = j;
//                        if (j - 1 > i){
//                            m = j - 1;
//                            while(m!=i){
//                                if(s.charAt(m)==')'){
//                                    break;
//                                }else{
//                                    m=m-1;
//                                }
//                            }
//                        }else{
//                            result=false;
//                            break;
//                        }
//                    }
//                } else if (s.charAt(i)=='[') {
//                    if(s.charAt(i+1)==']'){
//                        i=i+2;
//                    }else if(s.charAt(j)==']'){
//                        i=i+1;
//                        j=j-1;
//                    }else{
//                        result=false;
//                        break;
//                    }
//                } else if (s.charAt(i)=='{') {
//                    if(s.charAt(i+1)=='}'){
//                        i=i+2;
//                    }else if(s.charAt(j)=='}'){
//                        i=i+1;
//                        j=j-1;
//                    }else{
//                        result=false;
//                        break;
//                    }
//                }
//            }
//        }
        //1st approach - not enough
//            for(int i = 0 ; i < s.length() ; i++){
//                if(s.charAt(i) == '('){
//                    for(int j = i+1 ; j < s.length() ; j++){
//                        if(s.charAt(j) == ')'){
//                            result= true;
//                            break;
//                        }
//                    }
//                    if(result!= null && !result) {
//                        result = false;
//                        break;
//                    }
//                }
//                if(s.charAt(i) == '['){
//                    for(int j = i+1 ; j < s.length() ; j++){
//                        if(s.charAt(j) == ']'){
//                            result= true;
//                            break;
//                        }
//                    }
//                    if(result!= null && !result) {
//                        result = false;
//                        break;
//                    }
//                }
//                if(s.charAt(i) == '{'){
//                    for(int j = i+1 ; j < s.length() ; j++){
//                        if(s.charAt(j) == '}'){
//                            result= true;
//                            break;
//                        }
//                    }
//                    if(result!= null && !result) {
//                        result = false;
//                        break;
//                    }
//                }
//            }
//        }
//        if(result==null)
//            result = false;
//        boolean result2 = result;

    }
}
