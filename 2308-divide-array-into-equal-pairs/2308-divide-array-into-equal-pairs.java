class Solution {
    public boolean divideArray(int[] nums) {
        Arrays.sort(nums);
        int ct=0;
        for(int i=0,j=1;i<nums.length && j<nums.length;i+=2,j+=2)
        {
            if(nums[i]==nums[j])
            {
ct++;
            }
        }

    return ct==(nums.length)/2;   
    }
}