//https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/
class ASR {
    public boolean check(int[] nums) {
        int count=0;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i-1]>nums[i])
            {
                count++;
            }
        }
        if(nums[nums.length-1]>nums[0])
        {
            count++;
        }
        return count<=1;
    }
}
