//https://leetcode.com/problems/sort-vowels-in-a-string/description/
class Solution {
    public String sortVowels(String s) {
            ArrayList<Character> lt =new ArrayList<>();
        for (char ch:
             s.toCharArray()) {
            if(isVowel(ch))
            {
                lt.add(ch);
            }
        }
        Collections.sort(lt);
        System.out.println(lt.toString());
        StringBuilder
                 rs=new StringBuilder();
        int vowels=0;
        for (char ch:
             s.toCharArray()) {
            if(isVowel(ch))
            {
                rs.append(lt.get(vowels++));
            }
            else {
                rs.append(ch);
            }
        }
        return rs.toString();

    }
     public static boolean isVowel(char ch)
    {
        return (ch=='a' || ch=='e'||ch=='i'|| ch=='o'||ch=='u'||ch=='A' || ch=='E'||ch=='I'|| ch=='O'||ch=='U' );
    }
}
