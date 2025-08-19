class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long count = 0, result = 0;
        for (int num : nums) {
            if (num == 0) {
                count++;       // extend zero streak
                result += count; // add new subarrays ending here
            } else {
                count = 0;     // reset streak
            }
        }
        return result;
    }
}
