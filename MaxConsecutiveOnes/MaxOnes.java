class Solution {
    public int longestOnes(int[] nums, int k) {
        int zeroct=0,i=0;
        int res=0;
        for(int j=0;j<nums.length;j++)
        {
            if(nums[j]==0)zeroct++;
            while(zeroct>k)
            {
                if(nums[i]==0)zeroct--;
                i++;
            }
          res=Math.max(res,j-i+1);
        }
    return res;
     
    }
}
