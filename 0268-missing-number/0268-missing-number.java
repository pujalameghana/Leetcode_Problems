class Solution {
    public int missingNumber(int[] nums) {
        int a=nums.length;
        int sum=0;
        int s1=0;
        for(int i=0;i<a;i++){
            sum+=nums[i];
        }
        s1=(a*(a+1))/2;
        int s2=s1-sum;
        return s2;
    }

}