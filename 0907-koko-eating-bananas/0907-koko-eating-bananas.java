class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = getMax(piles);
        
        while (left < right) {  // use strict inequality
            int mid = left + (right - left) / 2;
            long totalHours = getHours(piles, mid);  // use long!

            if (totalHours <= h) {
                right = mid; // try a smaller k
            } else {
                left = mid + 1; // need to eat faster
            }
        }

        return left; // left == right is the smallest valid k
    }

    private int getMax(int[] piles) {
        int max = 0;
        for (int pile : piles) {
            max = Math.max(max, pile);
        }
        return max;
    }

    private long getHours(int[] piles, int k) {
        long hours = 0;
        for (int pile : piles) {
            hours += (pile + k - 1) / k;  // safe ceil division
        }
        return hours;
    }
}
