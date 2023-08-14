//https://leetcode.com/problems/find-the-value-of-the-partition/description/
class Solution {
    public int findValueOfPartition(int[] nums) {
  Arrays.sort(nums);
  int min=Integer.MAX_VALUE;
  for(int i=1;i<nums.length;i++)
  {
      min=Math.min(min,nums[i]-nums[i-1]);
  }
  return min;
 }
}
