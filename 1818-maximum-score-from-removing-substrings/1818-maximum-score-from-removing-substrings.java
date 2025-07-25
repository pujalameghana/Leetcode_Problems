class Solution {
    public int maximumGain(String s, int x, int y) {
        // Decide which substring to remove first for maximum gain
        if (x > y) {
            // Remove "ab" first, then "ba"
            return removePairs(s, 'a', 'b', x, y);
        } else {
            // Remove "ba" first, then "ab"
            return removePairs(s, 'b', 'a', y, x);
        }
    }

    // Function to remove the target pair first, then the reverse pair
    private int removePairs(String s, char firstChar, char secondChar, int firstVal, int secondVal) {
        StringBuilder stack1 = new StringBuilder();
        int score = 0;

        // First pass: remove the higher valued pair (firstChar + secondChar)
        for (char c : s.toCharArray()) {
            int len = stack1.length();
            if (len > 0 && stack1.charAt(len - 1) == firstChar && c == secondChar) {
                stack1.deleteCharAt(len - 1);
                score += firstVal;
            } else {
                stack1.append(c);
            }
        }

       
        StringBuilder stack2 = new StringBuilder();
        for (int i = 0; i < stack1.length(); i++) {
            char c = stack1.charAt(i);
            int len = stack2.length();
            if (len > 0 && stack2.charAt(len - 1) == secondChar && c == firstChar) {
                stack2.deleteCharAt(len - 1);
                score += secondVal;
            } else {
                stack2.append(c);
            }
        }

        return score;
    }
}
