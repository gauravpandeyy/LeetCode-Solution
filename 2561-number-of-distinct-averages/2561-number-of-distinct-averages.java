class Solution {
    public int distinctAverages(int[] nums) {
           boolean[] sums =  new boolean[201];
        int distinct = 0;
        Arrays.sort(nums);
        for (int i = 0, j = nums.length -1; i < j; i++, j--) {
            if (!sums[nums[i] + nums[j]]) {
                distinct++;
            }
            sums[nums[i] + nums[j]] = true;
        }
        return distinct;
    }
}