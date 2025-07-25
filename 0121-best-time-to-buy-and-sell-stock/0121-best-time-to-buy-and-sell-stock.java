class Solution {
    public int maxProfit(int[] prices) {
        int mxp=0;
        int mnc=prices[0];
        for(int i=1;i<prices.length;i++){
            mxp=Math.max(mxp,prices[i]-mnc);
            mnc=Math.min(mnc,prices[i]);
        }
        return mxp;
        
    }
}