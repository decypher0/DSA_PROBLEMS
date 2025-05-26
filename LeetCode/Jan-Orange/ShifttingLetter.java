package LeetCodeJanOrange;

public class ShifttingLetter {

    public static void main(String[] args) {

    }

    private char shiftCharacter(char c, int shift) {
        shift = shift % 26;
        return (char) ('a' + (c - 'a' + shift + 26) % 26);
    }

    public String shiftingLetters(String s, int[][] shifts) {
        int totalChars = s.length();
        int[] relativePositions = new int[totalChars];

        for (int[] shift : shifts) {
            int left = shift[0];
            int right = shift[1];
            int inc = shift[2] == 1 ? 1 : -1;

            relativePositions[left] += inc;

            if (right < totalChars - 1) {
                relativePositions[right + 1] -= inc;
            }
        }

        StringBuilder resultBuilder = new StringBuilder();

        int currentChange = 0;

        for (int i = 0; i < totalChars; i++) {
            currentChange += relativePositions[i];
            resultBuilder.append(shiftCharacter(s.charAt(i), currentChange));
        }
        return resultBuilder.toString();
    }
}
