class Solution {
    public int getLucky(String s, int k) {
        StringBuilder n= new StringBuilder();
        for(char ch:s.toCharArray()){
            n.append(ch-'a'+1);


        }
        while( k>0){
            int m=0;
            for(char d:n.toString().toCharArray()){
                m+=d-'0';
            }
            n=new StringBuilder(String.valueOf(m));
            k--;
        }
        return Integer.parseInt(n.toString());

        
    }
}