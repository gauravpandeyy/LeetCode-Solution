class Solution {
    public String reverseWords(String s) {
        StringBuilder sb=new StringBuilder();
        String[] words=s.split(" ");
        for(String i:words)
        {
            StringBuilder tmp=new StringBuilder(i);
            tmp.reverse();
            sb.append(tmp);
        sb.append(" ");    
        }
        return sb.toString().trim();
    }
}
