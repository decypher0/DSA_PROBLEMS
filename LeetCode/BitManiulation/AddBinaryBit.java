package Bit_Manipulation;

import java.util.Scanner;

public class AddBinaryBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        String result = null;
        if (a.length() == b.length()) {
            result = addBits(a, b);
        } else {
            if (a.length() > b.length()) {
                int n = a.length() - b.length();
                while (n-- > 0) {
                    b = '0' + b;
                }
            }else{
                int n = b.length() - a.length();
                while (n-- > 0) {
                    b = '0' + b;
                }
            }
            result = addBits(a, b);
        }
        System.out.println(result);
    }

    private static String addBits(String a, String b) {
        String result = "";
        boolean isOnePlusOne = false;
        for (int i = a.length() - 1; i >= 0; i--) {
            if (a.charAt(i) == '1' && b.charAt(i) == '1') {
                if (i == 0) {
                    result = '0' + result;
                    result = '1' + result;
                } else {
                    result = '0' + result;
                    isOnePlusOne = true;
                }
            }else if(a.charAt(i) == '0' && b.charAt(i) == '0'){
                if(isOnePlusOne){
                    result = '1' + result;
                }else{
                    result = '0' + result;
                }
            }
            else {
                if (isOnePlusOne) {
                    if (i == 0) {
                        result = '0' + result;
                        result = '1' + result;
                    } else {
                        if (a.charAt(i) == '1' || b.charAt(i) == '1') {
                            result = '0' + result;
                        } else {
                            result = '1' + result;
                            isOnePlusOne = false;
                        }
                    }
                }else{
                    result = '1' + result;
                }
            }
        }
        return result;
    }
}
