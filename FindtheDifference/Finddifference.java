//https://leetcode.com/problems/find-the-difference/
class Solution {
    public char findTheDifference(String s, String t) {
        char ch[]=s.toCharArray();
        char ch2[]=t.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(ch2);
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]==ch2[i])continue;
            else return ch2[i];
        }
return ch2[ch.length];
    }
}

