class Solution {
    public int maxAscendingSum(int[] nums) {
       int curr = nums[0];
        int ans = nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]<=nums[i-1])
            {
                ans =Math. max(ans,curr);
                curr = nums[i];
            }
            else 
            {
                curr += nums[i];
            }
        }
        ans = Math.max(ans,curr);
        return ans;
    }
}