class Solution {
    private boolean isPrime(int n){
        int ct = 0;
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                ct+=2;
                
                if(i*i == n){
                    ct--;
                }
            }
        }
        return ct==2;
    }
    public int diagonalPrime(int[][] nums) {
        int n = nums.length;
        int ans = 0;
        
        for(int i=0;i<n;i++){
            if(isPrime(nums[i][i])){
                ans = Math.max(ans, nums[i][i]);
            }
        }
        
        for(int i=0;i<n;i++){
            if(isPrime(nums[i][n-i-1])){
                ans = Math.max(ans, nums[i][n-i-1]);
            }
        }
        return ans;
    }
}