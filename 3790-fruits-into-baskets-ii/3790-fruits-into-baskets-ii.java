class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int alloted=0;
        int n=fruits.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(fruits[i]<=baskets[j]){
                    alloted++;
                    baskets[j]=-1;
                    break;


                }
            }
        }
        return n-alloted;
        
    }
}