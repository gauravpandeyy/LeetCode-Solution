class Solution {
    public boolean backspaceCompare(String s, String t) {
   return Check(s).equals(Check(t));
    }
    private String Check(String st)
    {
        StringBuilder sb=new StringBuilder();
        for(char c:st.toCharArray())
        {
            if(c!='#')
            {
                sb.append(c);
            }
            else if(sb.length()!=0){
                sb.deleteCharAt(sb.length()-1);
            }
        }
        return sb.toString();
    }
}
