package LeetCodeJanOrange;

public class CountingWordsWithAGivenPrefix {
    public static void main(String[] args) {
        String[] words = {"pay","attention","practice","attend"};
        String pref = "at";
        int result = CountingPrefix(words ,pref);
        System.out.println(result);
    }

    private static int CountingPrefix(String[] words, String pref) {
        int count=0;
        for (int i= 0; i < words.length; i++) {
            if(pref.length()<=words[i].length()){
                if(words[i].contains(pref)){
                    boolean isPrefix = true;
                    for (int j = 0; j < pref.length(); j++) {
                        if(words[i].charAt(j)!=pref.charAt(j)){
                            isPrefix = false;
                        }
                    }
                    if(isPrefix)
                        count++;
                }
            }
        }
        return count;
    }
}
