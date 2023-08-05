//https://leetcode.com/problems/account-balance-after-rounded-purchase/description/
class Solution {
        public static int accountBalanceAfterPurchase(int pa) {
        int rem=pa%10;
        if(rem==0)
        {
            return 100-pa;
        }
       // 16
        if(rem>5)
        {
          int diff=Math.abs(10-rem);
          return 100-(pa+diff);
        }
        //14 13 12 11
        if(rem<5)
        {
            return 100-(pa-rem);
        }
        return 100-(pa+5);
    }
}
