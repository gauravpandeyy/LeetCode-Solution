//https://leetcode.com/problems/number-of-beautiful-pairs/description/
class Solution {
    int gcd(int x, int y){
        if(x==0){
            return y;
        }
        return gcd(y%x,x);
       }
    
    private int getFirstDigit(int num){
        int currDigit = num%10;
        while(num>0){
            currDigit = num%10;
            num/=10;
        }
        return currDigit;
    }
    public int countBeautifulPairs(int[] nums) {
        int ans = 0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            int fd = getFirstDigit(nums[i]);
            for(int j=i+1;j<n;j++){
                int ld = nums[j]%10;
                if(gcd(fd,ld)==1){
                    ans++;
                }
            }
        }
        return ans;
    }
}
