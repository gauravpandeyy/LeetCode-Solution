class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
      int max=0;
      int ct=0;
      for(int i=0;i<nums.length;i++)
      {
          if(nums[i]==1)
          {
              ct++;
          }
          else{
       max=Math.max(ct,max);
       ct=0;
          }
      }
      return Math.max(ct,max);
    }
}
