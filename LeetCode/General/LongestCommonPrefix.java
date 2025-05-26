import java.util.Scanner;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] values = {"flower", "flow", "flight"};

        int shortLength = values[0].length();
        for (int i = 0; i < values.length; i++) {
            if (i + 1 < values.length && values[i].length() > values[i + 1].length()) {
                shortLength = values[i + 1].length();
            }
        }
        values[0] = values[0].substring(0, shortLength);
        values[1] = values[1].substring(0, shortLength);
        values[2] = values[2].substring(0, shortLength);

        for (int i = 0; i < values[0].length(); i++) {
            if (values[0].equals(values[1]) && values[0].equals(values[2])) {
                System.out.println(values[0]);
                break;
            } else {
                shortLength--;
                values[0] = values[0].substring(0, shortLength - 1);
                values[1] = values[1].substring(0, shortLength - 1);
                values[2] = values[2].substring(0, shortLength - 1);
            }
        }
        System.out.println(values[0]);
//        String prefix = values[0];
//        for (int i = 1; i < values.length; i++) {
//            while (values[i].indexOf(prefix) != 0) {
//                prefix = prefix.substring(0, prefix.length() - 1);
//                if (prefix.isEmpty()) {
//                    break;
//                }
//            }
//        }
//        System.out.println(prefix);
    }
}


