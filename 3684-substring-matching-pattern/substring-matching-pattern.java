class Solution {
    public boolean hasMatch(String s, String p) {
        int index = p.indexOf('*');
        int firstpos = s.indexOf(p.substring(0, index)); 
        int secondpos = s.indexOf(p.substring(index + 1), firstpos + index); 
        if (firstpos != -1 && secondpos != -1) {
            return true;
        }
        return false;  
    }
}

