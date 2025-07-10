class Solution {
    public int maxDifference(String s) {
        int[] map=new int[26];
        for(char c:s.toCharArray())
        {
            map[c-'a']++;
        }
        int max=0,min=s.length();
        for(int i=0;i<26;i++)
        {
            if(map[i]%2==1)
            {
                max=Math.max(max,map[i]);
            }
            if(map[i]%2==0 && map[i]>0)
            {
                min=Math.min(min,map[i]);
            }
        }
        return max-min;
    }
}