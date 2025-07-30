class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int e=0;
        int o=1;
        int []arr=new int[n];
        for(int a:nums){
            if(a>0){
                arr[e]=a;
                e+=2;
            }
            else{
                arr[o]=a;
                o+=2;
            }
        }
        return arr;
        
            

       
        
    }
}