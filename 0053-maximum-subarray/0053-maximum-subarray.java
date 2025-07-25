class Solution {
    public int maxSubArray(int[] nums) {
        int cs=0;
        int ms=nums[0];
        for(int n:nums){
            cs=cs+n;
            ms=Math.max(ms,cs);
            if(cs<0)
            cs=0;

        }
        return ms;
        
    }
}