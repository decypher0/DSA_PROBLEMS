package LeetCodeJanOrange;

import java.util.List;

public class WordSubSet {
    private int[] maxFreqArr = new int [26];

    private void updateFreq(String word) {
        int[] curFreq = new int[26];
        for (char c : word.toCharArray()) {
            curFreq[c - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            maxFreqArr[i] = Math.max(maxFreqArr[i], curFreq[i]);
        }
    }

    private boolean isUniversalString(String word) {
        int[] curFreq = new int[26];

        for (char c : word.toCharArray()) {
            curFreq[c - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (curFreq[i] < maxFreqArr[i]) {
                return false;
            }
        }
        return true;
    }

    public List<String> wordSubsets(String[] words1, String[] words2) {
        for (String word : words2) {
            updateFreq(word);
        }
        List<String> result = new ArrayList<>();

        for (String word : words1) {
            if (isUniversalString(word)) {
                result.add(word);
            }
        }
        return result;

    }
}
}
