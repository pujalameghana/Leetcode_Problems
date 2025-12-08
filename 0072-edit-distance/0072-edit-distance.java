class Solution {
    public int minDistance(String word1, String word2) {
        int row=word1.length()+1;
        int col=word2.length()+1;
        int[][] dp=new int[row][col];
        for(int j=0;j<col;j++){
            dp[0][j]=j;
        }
        for(int i=0;i<row;i++){
            dp[i][0]=i;
        }
        for(int i=1;i<row;i++){
            for(int j=1;j<col;j++){
                if(word1.charAt(i-1)==word2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1];
                
                }
                else{
                    int left=dp[i][j-1];
                    int dia=dp[i-1][j-1];
                    int top=dp[i-1][j];
                    dp[i][j]=Math.min(Math.min(left,dia),top)+1;
                }
            }
        }
        return dp[row-1][col-1];


        
    }
}