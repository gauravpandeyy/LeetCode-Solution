class Solution {
    public int[] getNoZeroIntegers(int n) {
         int[] res = new int[2];
        
        for (int i = 1; i < n; i++) {
            int c = n - i;
            if (check(c) && check(i)) {
                res[0] = i;
                res[1] = c;
                return res;
            }
        }
        return res;
    }

    public boolean check(int m) {
        while (m > 0) {
            int digit = m % 10;
            if (digit == 0) {
                return false;
            }
            m /= 10;
        }
        return true;
    }
}
