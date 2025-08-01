class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> a=new ArrayList<>();
        int n=matrix.length;
        int m=matrix[0].length;
        int t=0,b=n-1,r=m-1,l=0;
        while(l<=r && t<=b){
            for(int i=l;i<=r;i++){
                a.add(matrix[t][i]);
                
            }
            t++;
            for(int i=t;i<=b;i++){
               a.add(matrix[i][r]);
            }
            r--;
            
                if(t<=b){
                    for(int i=r;i>=l;i--){
                        a.add(matrix[b][i]);
                    }
                }
            
            b--;
            if(l<=r){
                for(int i=b;i>=t;i--){
                    a.add(matrix[i][l]);
                }
            }
            l++;


            }
        return a;



        
    }
}