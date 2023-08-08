//https://leetcode.com/problems/reverse-prefix-of-word/ 
//question number 2000
class Solution {
    public String reversePrefix(String word, char ch) {
          int index = word.indexOf(ch);
        if(index == -1) return word;
        StringBuilder sb = new StringBuilder(word.substring(0,index+1));
        return sb.reverse().toString()+word.substring(index+1);
        
    }
}
