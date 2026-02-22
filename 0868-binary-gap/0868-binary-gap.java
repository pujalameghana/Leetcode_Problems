class Solution {
    public int binaryGap(int n) {
        String num=Integer.toBinaryString(n);
        int max=0;
        int idx_1=0;
        for(int i=1;i<num.length();i++){
            if(num.charAt(i)=='1'){
                max=Math.max(max,i-idx_1);
                idx_1=i;
            }
        }
        return max;


        
    }
}