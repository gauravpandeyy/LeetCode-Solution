//https://leetcode.com/problems/maximum-repeating-substring/
class Solution {
    public int maxRepeating(String sequence, String word) {
        int answer=0;
       String toBeFound=word;
       while(sequence.contains(toBeFound)){
           toBeFound+=word;
           answer++;
       }
       return answer;
        
    }
}
