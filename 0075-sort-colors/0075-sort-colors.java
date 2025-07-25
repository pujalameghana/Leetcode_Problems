class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int pos=0;
        for(int i=0;i<2;i++){
            for(int j=pos;j<n;j++){
                if(nums[j]==i){
                    nums[j]=nums[pos];
                    nums[pos]=i;
                    pos++;

                }
            }
        }
        
        }
        
        
    }
