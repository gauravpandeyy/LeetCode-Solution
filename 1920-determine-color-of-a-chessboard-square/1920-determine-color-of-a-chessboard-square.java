class Solution {
    public boolean squareIsWhite(String cd) {
        char ch1=cd.charAt(0);
        char ch2=cd.charAt(1);
        if((ch1%2 == 1 && ch2%2 == 1) || (ch1%2 == 0 && ch2%2 == 0)){
            return false;
        }
        return true;
    }
}