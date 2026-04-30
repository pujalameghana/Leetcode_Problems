

class Solution {
    public int maxProduct(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        int result = arr[0];

        for (int i = 1; i < arr.length; i++) {
            
            // If negative, swap
            if (arr[i] < 0) {
                int temp = max;
                max = min;
                min = temp;
            }

            max = Math.max(arr[i], max * arr[i]);
            min = Math.min(arr[i], min * arr[i]);

            result = Math.max(result, max);
        }

        return result;
    }
}