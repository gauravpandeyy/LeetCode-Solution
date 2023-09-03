class Solution {
    public String convertToTitle(int columnNumber) {
           String ans = "";
        while (columnNumber>0){
            columnNumber--;
            ans = (char) ('A'+ (columnNumber%26)) + ans;
            columnNumber = columnNumber/26;
        }
        return ans;
    }
}
/*AA
A=65
1*26 to power 0 is 1
1 * 26 to power 1 is 
26+1==27



*/