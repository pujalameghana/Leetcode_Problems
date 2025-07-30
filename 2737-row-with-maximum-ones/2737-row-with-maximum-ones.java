class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int mx=0,k=0;
        int n=mat.length;
        int m=mat[0].length;
        for(int i=0;i<n;i++){
            int c=0;
            for(int j=0;j<m;j++){
                c+=mat[i][j];
                if(c>mx){
                    mx=c;
                    k=i;
                }
            }
        }
        return new int[]{k,mx};
        
    }
}