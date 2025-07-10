class Solution {
    public boolean isBalanced(String num) {
        int sumodd=0;
        int sumeven=0;
        for(int i=0;i<num.length();i++){
            if(i%2==0)
            {
                sumeven+=num.charAt(i) - '0';
            }
            if(i%2==1)
            {
                sumodd+=num.charAt(i)-'0';
            }
        }
        return sumodd==sumeven;
    }
}