class Solution {
    public int maxSum(int[] nums) {
            int maxSum = -1;
        for(int i = 0; i < nums.length - 1; i++) {
            for(int j = i+1; j < nums.length; j++) {
                int num1 = nums[i];
                
                int maxDigit1 = 0;
                while(num1 > 0) {
                    int rem = num1 % 10;
                    num1 /= 10;
                    
                    if(rem > maxDigit1) maxDigit1 = rem;
                }
                
                int num2 = nums[j];
                int maxDigit2 = 0;
                while(num2 > 0) {
                    int rem = num2 % 10;
                    num2 /= 10;
                    
                    if(rem > maxDigit2) maxDigit2 = rem;
                }
                
                if(maxDigit1 == maxDigit2) maxSum = Math.max(nums[i] + nums[j], maxSum);
            }
        } return maxSum;
     }
}
