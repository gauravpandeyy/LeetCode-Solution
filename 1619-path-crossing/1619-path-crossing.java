class Solution {
    public boolean isPathCrossing(String path) {
        Set<String> set=new HashSet<>();
        int x=0;
        int y=0;
        set.add(0+","+0);
        for(char c:path.toCharArray())
        {
            if(c=='N')
            {
                y++;
            }
             if(c=='E')
            {
                x++;
            }
             if(c=='S')
            {
                y--;
            }
             if(c=='W')
            {
                x--;
            }
            String ans=x+","+y;
            if(set.contains(ans))
            {
                return true;
            }
            set.add(ans);
        }
        return false;
    }
}