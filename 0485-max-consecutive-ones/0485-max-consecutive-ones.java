class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int c=0;
        int m=0;
        for(int a:nums){
            if(a!=0){
                c+=1;
               
                
            }
            else{
                m=Math.max(m,c);
                c=0;
            }

            
        }
         m=Math.max(m,c);
        return m;
        
    }
}