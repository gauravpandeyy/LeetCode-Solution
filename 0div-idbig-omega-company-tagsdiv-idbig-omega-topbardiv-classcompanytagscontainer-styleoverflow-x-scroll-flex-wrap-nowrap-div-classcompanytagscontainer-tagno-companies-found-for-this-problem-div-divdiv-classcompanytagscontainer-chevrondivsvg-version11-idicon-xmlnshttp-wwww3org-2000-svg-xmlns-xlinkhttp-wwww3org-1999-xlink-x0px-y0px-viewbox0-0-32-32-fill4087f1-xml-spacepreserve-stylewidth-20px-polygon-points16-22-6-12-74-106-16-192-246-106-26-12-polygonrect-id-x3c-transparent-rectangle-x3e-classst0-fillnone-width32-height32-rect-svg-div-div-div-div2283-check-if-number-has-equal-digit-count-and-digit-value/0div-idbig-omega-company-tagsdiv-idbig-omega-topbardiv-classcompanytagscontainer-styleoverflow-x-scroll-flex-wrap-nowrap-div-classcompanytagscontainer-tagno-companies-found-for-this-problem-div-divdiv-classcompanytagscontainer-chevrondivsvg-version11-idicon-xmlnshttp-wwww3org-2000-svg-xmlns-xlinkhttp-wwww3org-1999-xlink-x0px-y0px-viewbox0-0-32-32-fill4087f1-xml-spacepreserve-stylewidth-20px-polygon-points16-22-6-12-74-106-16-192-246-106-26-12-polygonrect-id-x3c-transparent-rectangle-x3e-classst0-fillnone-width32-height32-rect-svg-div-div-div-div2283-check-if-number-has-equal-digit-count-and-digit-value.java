class Solution {
    public boolean digitCount(String num) {
        int[] lol=new int[10];
        for(int i=0;i<num.length();i++)
        {
            lol[num.charAt(i)-'0']++;
        }
         for(int i=0;i<num.length();i++)
         {
             int curr=num.charAt(i)-'0';
             if(curr!=lol[i])
             {
                 return false;
             }
         }
return true;
    }
}