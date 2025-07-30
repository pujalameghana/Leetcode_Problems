class Solution {
    public int majorityElement(int[] nums) {
       
        int c=0;
        int elt=0;
        for(int a:nums){
            if(c==0){
            elt=a;
            c=1;
            }
            else if(a==elt){
                c++;
            }
            else{
                c--;
            }

        }
        return elt;


    
        
    }
}