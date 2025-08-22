class Solution {
    public String shortestPalindrome(String s) {
        if (s == null || s.length() == 0) return s;

        int n = s.length();
        int l = 0;

        // Find longest palindromic prefix
        for (int r = n - 1; r >= 0; r--) {
            if (s.charAt(l) == s.charAt(r)) {
                l++;
            }
        }

        // If entire string is already a palindrome
        if (l == n) return s;

        String suffix = s.substring(l); // the part not included in palindrome
        String prefix = new StringBuilder(suffix).reverse().toString();

        // recursively process the palindromic prefix
        String mid = shortestPalindrome(s.substring(0, l));

        return prefix + mid + suffix;
    }
}
