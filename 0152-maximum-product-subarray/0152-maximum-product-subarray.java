class Solution {
    public int maxProduct(int[] nums) {
        int mnp=nums[0],mxp=nums[0],res=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]<0){
                int temp=mxp;
                mxp=mnp;
                mnp=temp;
            }
                mxp=Math.max(nums[i],nums[i]*mxp);
                mnp=Math.min(nums[i],nums[i]*mnp);
                res=Math.max(mxp,res);
            
        }
        return res;
        
    }
}