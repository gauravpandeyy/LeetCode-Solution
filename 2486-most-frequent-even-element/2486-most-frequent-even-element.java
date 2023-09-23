class Solution {
    public int mostFrequentEven(int[] nums) {
        int max=0,count=0,element=-1;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if(i==0 && nums[i]%2==0){
                count++;
            } else if (nums[i] % 2 == 0 && nums[i]!=nums[i-1]) {
                count=0;
                count++;
            } else if (nums[i] % 2 == 0 && nums[i]==nums[i-1]) {
                count++;
            }
            if (count>max){
                max=count;
                element=nums[i];
            }
        }
        return element;
     }
}
// 0 1 1 2 2 4 4