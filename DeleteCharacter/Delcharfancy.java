//https://leetcode.com/problems/delete-characters-to-make-fancy-string/description/?envType=list&envId=rijvyth1
class Solution {
    public String makeFancyString(String s) {
        char previous=s.charAt(0);
        int freq=1;
        StringBuilder sb=new StringBuilder();
        sb.append(s.charAt(0));
        for(int i=1;i<s.length();i++)
        {
            if(s.charAt(i)==previous)
            {
                freq++;
            }
            else
            {
                previous=s.charAt(i);
                freq=1;
            }
            if(freq<3)
            {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
