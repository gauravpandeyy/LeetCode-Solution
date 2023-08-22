//https://leetcode.com/problems/chalkboard-xor-game/
class Solution {
    public boolean xorGame(int[] nums) {
        int xorSum = 0;
        for (int num : nums) {
            xorSum ^= num;
        }
        
        if (xorSum == 0) {
            return true; 
        }
        
        int n = nums.length;
        return n % 2 == 0; 
    }
}
