class Solution {
    public int minimumRecolors(String blocks, int k) {
        int n=blocks.length();
        int i=0,j=0;
        int count=0;
        int ans=Integer.MAX_VALUE;
        while(j<n){
            if(blocks.charAt(j)=='W'){
                
                count++;
            }
            if(j-i+1<k){
                j++;
            }
            else if(j-i+1==k){
                ans=Math.min(ans,count);
                if(blocks.charAt(i)=='W'){
                    count--;
                }
                i++;
                j++;
            }
        }
        return  ans;
    }
}
