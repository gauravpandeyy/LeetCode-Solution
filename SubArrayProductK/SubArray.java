//713. Subarray Product Less Than K
class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
   int i = 0,n = nums.length,product = 1,result = 0;
        for(int j = 0;j<n;j++)
        {
            product = product*nums[j];
            while(i<=j && product>=k)
            {
                product = product/nums[i];
                i++;
            }
            result += j-i+1;
        }
        return result;
   }
}
