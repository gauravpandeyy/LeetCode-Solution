class Solution {
    public String toGoatLatin(String s) {
        String[] words=s.split(" ");
        StringBuilder sb=new StringBuilder();
        String a="a";
        for(String st:words)
        {
            String newword="";
            char ch=st.charAt(0);
            if(isVowel(Character.toLowerCase(ch)))
            {
                newword=st+"ma"+a;
            }
            else{
                newword=st.substring(1)+ch+"ma"+a;
            }
            sb.append(" "+newword);
            a=a+"a";
        }
        return sb.toString().substring(1);

        
        
    }
    private boolean isVowel(char ch)
    {
        return (ch=='a' || ch=='e'|| ch=='i' || ch=='o' || ch=='u'); 
    }
}