class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        String[] ans=text.split(" ");
        ArrayList<String> lt =new ArrayList<>();
        for(int i=0;i<ans.length-2;i++)
        {
            if(ans[i].equals(first) && ans[i+1].equals(second))
            {
            lt.add(ans[i+2]);
            }
        }
        String[] lol=new String[lt.size()];
        int a=0;
        for(String i:lt)
        {
            lol[a++]=i;
        }
        return lol;
    }
}